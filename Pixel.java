// Honor Pledge
// I hereby declare upon my word of honor that I have neither given nor received unauthorized aid on this project
// - Megan Meiser

package com.company;

public class Pixel {
    private int red;
    private int green;
    private int blue;

    /**
     * Creates a pixel object based on its red, green, and blue values
     * @param red the red value of the pixel
     * @param green the green value of the pixel
     * @param blue the blue value of the pixel
     */
    public Pixel(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    /**
     * Turns the pixel into greyscale by averaging the 3 color values and setting them to be the newly-calculated average
     */
    public void greyscale() {
        int avgColor = (red + green + blue) / 3;
        red = avgColor;
        green = avgColor;
        blue = avgColor;
    }

    /**
     * Gets the integer that represents the red color
     * @return the value of the red color
     */
    public int getRed() {
        return red;
    }

    /**
     * Gets the integer that represents the green color
     * @return the value of the green color
     */
    public int getGreen() {
        return green;
    }

    /**
     * Gets the integer that represents the blue color
     * @return the value of the blue color
     */
    public int getBlue() {
        return blue;
    }
}