package navigation.data;

public class Bus implements Car {
    public void drive() {
        System.out.println("Bus Driving...");
    }

    public int getTire() {
        return 8;
    }

    public String getBrand() {
        return "MAN";
    }

    public boolean isMainTen() {
        return true;
    }
}
