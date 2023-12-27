package org.example.Opgave4;

public class Loops {
    private final String whiteSpace = " ";
    private final String star = "*";

    // Print left side of a triangle.
    public void drawLeftTriangle(int i) {
        for(int n = 1; n < i ; n++) {
            // String.repeat will, as given by the method call, repeat a string n times.
            System.out.println(whiteSpace.repeat(10-n) + star.repeat(n));
        }
    }

    // Print right side of a triangle.
    public void drawRightTriangle(int i) {
        for(int n = 1;  n < i ; n++) {
            // String.repeat will, as given by the method call, repeat a string n times.
            System.out.println(star.repeat(n) + whiteSpace.repeat(10-n));
        }
    }
}
