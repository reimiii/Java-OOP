class Parent {
    String name;

    void doIt() {
        System.out.println("From Parent");
    }
}

class Child extends Parent {
    String name;

    void doIt() {
        System.out.println("From Child");
        System.out.println("Parent name is " + super.name);
    }
}
