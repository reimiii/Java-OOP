public class VicePresident extends Manager {
    VicePresident(String name, String address) {
        super(name, address);
    }

    void sayHelloTo(String name) {
        System.out.println("Hello " + name + ", my name is Vice President " + this.name);
    }
}
