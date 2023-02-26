package navigation.data;

public class Run {
    // abstract class
    public static void main(String[] args) {
//        var location = new Location();
        var city = new City("Jakarta");
        city.build();
        System.out.println(city.name);
    }
}
