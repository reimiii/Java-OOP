package navigation.data;

import java.util.Objects;

public class Avanza implements Car {
    public String supir;
    public int price;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Avanza avanza = (Avanza) o;

        if (price != avanza.price) return false;
        return supir != null ? supir.equals(avanza.supir) : avanza.supir == null;
    }

    @Override
    public int hashCode() {
        int result = supir != null ? supir.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }

    //    public boolean equals(Object obj) {
//        if (obj == this) return true;
//        if (!(obj instanceof Avanza)) return false;
//
//        Avanza avanza = (Avanza) obj;
//        if ()
//    }
}
