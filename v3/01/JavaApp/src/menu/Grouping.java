package menu;

import java.util.*;

import static java.util.stream.Collectors.*;

import static menu.Dish.dishTags;
import static menu.Dish.menu;


public class Grouping {

    enum CaloricLevel { DIET, NORMAL, FAT };

    public static void main(String ... args) {
        System.out.println("Dishes grouped by type: " + groupDishesByType());
     
        System.out.println("Dishes grouped by caloric level: " + groupDishesByCaloricLevel()); 
   
    }

    private static Map<Dish.Type, List<Dish>> groupDishesByType() {
        return menu.stream().collect(groupingBy((Dish dish) -> dish.getType()));
    }


    private static Map<CaloricLevel, List<Dish>> groupDishesByCaloricLevel() {
        return menu.stream().collect(
                groupingBy(dish -> {
                    if (dish.getCalories() <= 400) return CaloricLevel.DIET;
                    else if (dish.getCalories() <= 700) return CaloricLevel.NORMAL;
                    else return CaloricLevel.FAT;
                } ));
    }

}
