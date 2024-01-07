package org.example.Opgave5;

import java.util.Scanner;

public class HumanPlayer implements Player {
    private final String name;
    private final int random;
    private final int maxValue;

    public HumanPlayer(int random, String name, int maxValue) {
        this.random = random;
        this.name = name;
        this.maxValue = maxValue;
    }

    @Override
    public int makeAGuess() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input = (input >= maxValue && input <= maxValue) ? input : makeAGuess();
    }

    public String getName() {
        return name;
    }
}
