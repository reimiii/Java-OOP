public class Person {
    String name;
    String address;
    final String country = "ID";

    // variable shadowing
    // fix nya pake this keyword

    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    Person(String paramName) {
        this(paramName, null);
    }

    Person() {
        this(null);
    }

    void sayHelloTo(String name) {
        System.out.println("Hello " + name + ", my name is " + this.name);
    }

    // contoh untuk super keyword
    int salary(){
        return 1000;
    }
}
