package navigation.application;

import navigation.data.Avanza;

public class CarApp {
    public static void main(String[] args) {
        var car = new Avanza();
        car.supir = "Keke";
        car.price = 12221;
        car.drive();
        System.out.println(car.getTire());
        System.out.println("Big: " + car.isBig());
        System.out.println(car);

        var car2 = new Avanza();
        car2.supir = "Keke";
        car2.price = 12221;

        System.out.println(car.equals(car2));

        System.out.println(car.hashCode() == car2.hashCode());

    }
}
