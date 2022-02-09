// Honor Pledge
// I hereby declare upon my word of honor that I have neither given nor received unauthorized aid on this project
// - Megan Meiser

package com.company;

import java.io.FileInputStream;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        String filename = args[0]; // Grabs the file that was passed as a parameter
        Scanner in;
        try {
            FileInputStream file = new FileInputStream(filename);
            in = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
            return;
        }
        PrintWriter out = new PrintWriter("greyscale.ppm");

        // Reads in the data from the supplied ppm file
        String imageType = in.nextLine();
        int height = in.nextInt();
        int width = in.nextInt();
        int maxIntensity = in.nextInt();
        Pixel[][] pixels = new Pixel[height][width];
        // Iterates through the values that make up the image
        for (int x = 0; x < height; x++) {
            for (int y = 0; y < width; y++) {
                int red = in.nextInt();
                int green = in.nextInt();
                int blue = in.nextInt();
                Pixel pixel = new Pixel(red, green, blue);
                pixels[x][y] = pixel; // Assigns the newly-created pixel to the current location in the 2D array
            }
        }
        in.close();

        // Writes the data from the 2D array to a new ppm file
        out.println(imageType);
        out.println(height + " " + width);
        out.println(maxIntensity);
        for (int x = 0; x < 500; x++) {
            for (int y = 0; y < 500; y++) {
                pixels[x][y].greyscale(); // Turns the pixel into greyscale
                // Prints the pixel's values to the ppm file
                out.print(pixels[x][y].getRed() + " " + pixels[x][y].getGreen() + " " + pixels[x][y].getBlue() + " ");
            }
            out.println();
        }
        out.close();
        System.out.println("Photo was successfully generated");
    }
}