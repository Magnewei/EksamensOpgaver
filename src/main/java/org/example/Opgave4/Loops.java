package org.example.Opgave4;

public class Loops {
    private final String whiteSpace = " ";
    private final String star = "*";

    // Print left side of a triangle.
    public void drawLeftTriangle(int length) {
        for (int n = 1; n < length; n++) {
            System.out.println(whiteSpace.repeat(length - n) + star.repeat(n));
        }
    }

    // Print right side of a triangle.
    public void drawRightTriangle(int length) {
        for (int n = 1; n < length; n++) {
            System.out.println(star.repeat(n) + whiteSpace.repeat(length - n));
        }
    }

    public void drawSquare(int length) {
        for (int n = 1; n < length; n++) {
            System.out.println(star.repeat(length));
        }
    }
}
