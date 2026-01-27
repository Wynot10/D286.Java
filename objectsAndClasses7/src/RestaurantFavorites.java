public class RestaurantFavorites {
    public static void main(String[] args) {
        Restaurant favLunchPlace = new Restaurant();
        Restaurant favDinnerPlace = new Restaurant();
        Restaurant leastFavoriteRestaurant = new Restaurant();

        favLunchPlace.setName("Central Deli"); // Mutator or setter
        favLunchPlace.setRating(4); // Mutator or setter

        favDinnerPlace.setName("Friends Cafe"); // Mutator or setter
        favDinnerPlace.setRating(5); // Mutator or setter

        leastFavoriteRestaurant.setName("Fake Food"); // Mutator or setter
        leastFavoriteRestaurant.setRating(1); // Mutator or setter



        System.out.println("My favorite restaurants: ");
        favLunchPlace.print(); // Accessor or getter
        favDinnerPlace.print(); // Accessor or getter

        System.out.println("My least favorite restaurants: ");
        leastFavoriteRestaurant.print(); // Accessor or getter

        System.out.print("This is using a getter to print the name of the restaurant: ");
        System.out.println(favDinnerPlace.getName()); // Accessor or getter
    }
}
