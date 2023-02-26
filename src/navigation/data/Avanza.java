package navigation.data;

public class Avanza implements Car {

    public void drive() {
        System.out.println("Avanza Driver");
    }

    public int getTire() {
        return 4;
    }

    public String getBrand() {
        return "Toyota";
    }

    public boolean isMainTen() {
        return true;
    }

    public String toString() {
        return "Brand: " + getBrand();
    }
}
