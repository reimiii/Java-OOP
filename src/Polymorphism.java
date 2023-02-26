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
        if (person instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) person;
            System.out.println("Yahooo VP " + vicePresident.name);
        } else if (person instanceof Manager) {
            Manager manager = (Manager) person;
            System.out.println("Ahooy Manager " + manager.name);
        } else {
            System.out.println("Ohaaa " + person.name);
        }
    }
}
