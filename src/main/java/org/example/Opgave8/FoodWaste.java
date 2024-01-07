package org.example.Opgave8;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;


public class FoodWaste {
    private final LocalDate todayDate = LocalDate.of(2024, 01, 07);
    private final List<Integer> limits = Arrays.asList(03, 01, 14, 02, 05);


    public boolean checkDate(int category, LocalDate saleByDate) {
        LocalDate stopFoodWaste = saleByDate.minusDays(limits.get(category));

        if (saleByDate.isAfter(todayDate)) {
            return todayDate.isEqual(stopFoodWaste) || todayDate.isAfter(stopFoodWaste);
        }
        return false;
    }
}
