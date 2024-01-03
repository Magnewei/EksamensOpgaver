package org.example.Opgave5;

import java.util.Random;

public class ComputerPlayer implements Player {
    public int makeAGuess(int maxValue) {
        Random random = new Random();
        return random.nextInt(maxValue+1);
    }
}
