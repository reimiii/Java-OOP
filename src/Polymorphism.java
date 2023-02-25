public class Polymorphism {
    public static void main(String[] args) {
        // kode Polymorphism
        Person person = new Person("Hilmi", "Internet");
        person.sayHelloTo("David");

        person = new Manager("David", "Depok");
        person.sayHelloTo("Hilmi");

        person = new VicePresident("Toriq", "Naterman");
        person.sayHelloTo("David, Hilmi");

        helloToEveryBody(new Person("Hilmi", "Internet"));
        helloToEveryBody(new Manager("David", "Depok"));
        helloToEveryBody(new VicePresident("Toriq", "Depok"));
    }

    static void helloToEveryBody(Person person) {
        System.out.println("Yahooo " + person.name);
    }
}
