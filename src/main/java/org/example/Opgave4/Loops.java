package org.example.Opgave4;

public class Loops {
    private final String whiteSpace = " ";
    private final String star = "*";

    // Print left side of a triangle.
    public String drawLeftTriangle(int length) {
        String leftTriangle = "";
        for (int n = 1; n < length; n++) {
            leftTriangle += whiteSpace.repeat(length - n) + star.repeat(n) + "\n";
        }
        return leftTriangle;
    }

    // Print right side of a triangle.
    public String drawRightTriangle(int length) {
        String rightTriangle = "";
        for (int n = 1; n < length; n++) {
            rightTriangle += star.repeat(n);
        }
        return rightTriangle;
    }

    public String drawSquare(int length) {
        String square = "";
        for (int n = 1; n <= length; n++) {
            square += star.repeat(length) + "\n";
        }
        return square;
    }
}
