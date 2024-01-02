package org.example.Opgave8;


import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        FoodWaste foodWaste = new FoodWaste();

        LocalDate category1Check = LocalDate.of(2024, 01, 10); // 3 Days
        LocalDate category2Check = LocalDate.of(2024, 01,8);   // 1 Day
        LocalDate category3Check = LocalDate.of(2024, 01, 22); // 14 Days
        LocalDate category4Check = LocalDate.of(2024, 01, 3);  // 2 Days
        LocalDate category5Check = LocalDate.of(2024, 01, 10); // 5

        System.out.println(foodWaste.checkDate(0, category1Check));
        System.out.println(foodWaste.checkDate(1, category2Check));
        System.out.println(foodWaste.checkDate(2, category3Check));
        System.out.println(foodWaste.checkDate(3, category4Check));
        System.out.println(foodWaste.checkDate(4, category5Check));


    }
}
