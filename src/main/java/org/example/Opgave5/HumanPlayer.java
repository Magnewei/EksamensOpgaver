package org.example.Opgave5;

import java.util.Scanner;

public class HumanPlayer implements Player {

    @Override
    public int makeAGuess(int maxValue) {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
