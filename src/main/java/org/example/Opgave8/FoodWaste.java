package org.example.Opgave8;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;


public class FoodWaste {
    private final LocalDate todayDate = LocalDate.of(2024, 01, 07);

    public boolean checkDate(int category, LocalDate saleByDate) {
        // Initialize and add limits to ArrayList storing days before sale.
        List<Integer> limits = Arrays.asList(03, 01, 14, 02, 05);

        // Get value from limits where category equals index.
        LocalDate stopFoodWaste = saleByDate.minusDays(limits.get(category));

        // Check if expiry date is after saleByDate
        if (saleByDate.isAfter(todayDate)) {

            // Return true if last sales date is equal to or before todays date.
            return (todayDate.isEqual(stopFoodWaste) || todayDate.isAfter(stopFoodWaste));
        }
        return false;
    }
}
