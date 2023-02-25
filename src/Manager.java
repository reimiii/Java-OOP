public class Manager extends Person {
    // override method parent
    void sayHelloTo(String name) {
        System.out.println("Hello " + name + ", my name is Manager " + this.name);
    }

    // override method parent
    int salary() {
        return 2000;
    }

    // super keyword untuk mengakses method parent class
    int getSalary(){
        return super.salary();
    }
}
