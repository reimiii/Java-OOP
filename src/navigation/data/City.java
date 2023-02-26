package navigation.data;

public class City extends Location {
    protected City(String name) {
        this.name = name;
    }

    // abstract method
    @Override
    protected void build() {
        System.out.println(name + ": Build...");
    }
}
