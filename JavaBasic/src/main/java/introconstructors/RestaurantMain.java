package introconstructors;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant r = new Restaurant("myrest",4);
        System.out.println(r.getMenu());
    }
}
