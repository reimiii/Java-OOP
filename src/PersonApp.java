public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Hilmi", "Bogor");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Arieff");

        var person2 = new Person("Toriq");
        person2.sayHello("Bangun");

        var person3 = new Person();
    }
}
