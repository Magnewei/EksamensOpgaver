package org.example.Opgave8;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FoodWaste foodWaste = new FoodWaste();
        System.out.println(foodWaste.checkDate(0, LocalDate.of(2024, 01, 10)));
        System.out.println(foodWaste.checkDate(1, LocalDate.of(2024, 01,8)));
        System.out.println(foodWaste.checkDate(2, LocalDate.of(2024, 01, 22)));
        System.out.println(foodWaste.checkDate(3, LocalDate.of(2024, 01, 3)));
        System.out.println(foodWaste.checkDate(4, LocalDate.of(2024, 01, 10)));
    }
}
