public class Person {
    String name;
    String address;
    final String country = "ID";

    Person(String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;
    }

    Person(String paramName) {
        name = paramName;
    }

    Person(){

    }

    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", my name is " + name);
    }


}
