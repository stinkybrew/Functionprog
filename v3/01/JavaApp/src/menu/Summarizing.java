package menu;

import java.util.*;
import java.util.function.*;
import static java.util.stream.Collectors.*;

import static menu.Dish.dishTags;
import static menu.Dish.menu;

public class Summarizing {

    public static void main(String ... args) {
        System.out.println("Nr. of dishes: " + howManyDishes());
        System.out.println("The most caloric dish is: " + findMostCaloricDish());
      
        System.out.println("Total calories in menu: " + calculateTotalCalories());
        System.out.println("Average calories in menu: " + calculateAverageCalories());
      
    }


    private static long howManyDishes() {
        return menu.stream().collect(counting());
    }

    private static Dish findMostCaloricDish() {
        return menu.stream().collect(reducing((d1, d2) -> d1.getCalories() > d2.getCalories() ? d1 : d2)).get();
    }

    
    private static int calculateTotalCalories() {
        return menu.stream().collect(summingInt(dish -> dish.getCalories()));
    }

    private static Double calculateAverageCalories() {
        return menu.stream().collect(averagingInt(dish -> dish.getCalories()));
    }

}
