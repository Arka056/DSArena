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

    // Fields that were missing in your version
    private final Map<String, Food> foodMap;           // food -> Food object
    private final Map<String, TreeSet<Food>> cuisineMap; // cuisine -> sorted set of Food
    private final Map<String, String> foodToCuisine;   // food -> cuisine

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        foodMap = new HashMap<>();
        cuisineMap = new HashMap<>();
        foodToCuisine = new HashMap<>();

        // single comparator used for all cuisines
        Comparator<Food> cmp = (a, b) -> {
            if (a.rating != b.rating) return Integer.compare(b.rating, a.rating); // higher rating first
            return a.name.compareTo(b.name); // lexicographically smaller first
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

        // remove the object (using old rating), update it, then reinsert
        set.remove(f);    // use same object reference -> comparator matches on old rating
        f.rating = newRating;
        set.add(f);
    }

    public String highestRated(String cuisine) {
        TreeSet<Food> set = cuisineMap.get(cuisine);
        return set.first().name;
    }
}
