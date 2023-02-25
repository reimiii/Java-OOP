public class Manager extends Person {
    // super constructor
    Manager(String name, String address){
        super(name, address);
    }

    // override method parent
    void sayHelloTo(String name) {
        System.out.println("Hello " + name + ", my name is Manager " + this.name);
    }

    // override method parent
    int salary() {
        return 3000;
    }

    // super keyword untuk mengakses method parent class
    int getSalary(){
        return super.salary();
    }
}
