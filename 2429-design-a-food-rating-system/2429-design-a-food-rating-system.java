import java.util.*;

public class FoodRatings {
    private static class Food {
        String name;
        int rating;
        Food(String name, int rating) {
            this.name = name;
            this.rating = rating;
        }
    }
    private final Map<String, Food> foodMap;          
    private final Map<String, TreeSet<Food>> cuisineMap; 
    private final Map<String, String> foodToCuisine;  
    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        foodMap = new HashMap<>();
        cuisineMap = new HashMap<>();
        foodToCuisine = new HashMap<>();
        Comparator<Food> cmp = (a, b) -> {
            if (a.rating != b.rating) return Integer.compare(b.rating, a.rating);
            return a.name.compareTo(b.name); 
        };

        for (int i = 0; i < foods.length; i++) {
            String food = foods[i];
            String cuisine = cuisines[i];
            int rating = ratings[i];
            Food f = new Food(food, rating);
            foodMap.put(food, f);
            foodToCuisine.put(food, cuisine);
            cuisineMap
                .computeIfAbsent(cuisine, k -> new TreeSet<>(cmp))
                .add(f);
        }
    }

    public void changeRating(String food, int newRating) {
        Food f = foodMap.get(food);
        String cuisine = foodToCuisine.get(food);
        TreeSet<Food> set = cuisineMap.get(cuisine);
        set.remove(f); 
        f.rating = newRating;
        set.add(f);
    }

    public String highestRated(String cuisine) {
        TreeSet<Food> set = cuisineMap.get(cuisine);
        return set.first().name;
    }
}
