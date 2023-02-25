public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Hilmi", "Bogor");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHelloTo("Arieff");

        var person2 = new Person("Toriq");
        person2.sayHelloTo("Bangun");

        var person = new Person();
        person.name = "Hilmi";
        person.address = "Bogor";
        person.sayHelloTo("David");

        var manager = new Manager();
        manager.name = "David";
        manager.address = "Depok";
        manager.sayHelloTo("Hilmi");
    }
}
