package navigation.application;

import navigation.data.Avanza;

public class CarApp {
    public static void main(String[] args) {
        var car = new Avanza();
        car.drive();
        System.out.println(car.getTire());
        System.out.println("Big: " + car.isBig());
    }
}
