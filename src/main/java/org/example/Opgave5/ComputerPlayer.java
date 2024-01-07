package org.example.Opgave5;

import java.util.Random;

public class ComputerPlayer implements Player {
    private final String name;
    private final int maxValue;
    private final int random;

    public ComputerPlayer(int random, String name, int maxValue) {
        this.random = random;
        this.name = name;
        this.maxValue = maxValue;
    }

    public int makeAGuess() {
        Random random = new Random();
        return random.nextInt(maxValue+1);
    }
    public String getName() {
        return name;
    }
}
