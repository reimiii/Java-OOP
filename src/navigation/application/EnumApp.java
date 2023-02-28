package navigation.application;

import navigation.data.Customer;
import navigation.data.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Hilmi");
        customer.setLevel(Level.SUPER);

        System.out.println("Name: " + customer.getName());
        System.out.println("Level: " + customer.getLevel());
        System.out.println("Description: " + customer.getLevel().getDescription());

        String levelName = Level.SUPER.name();
        System.out.println(levelName);

        Level level = Level.valueOf("SUPER");
        System.out.println(level);

        System.out.println("Print Level");
        Level[] levels = Level.values();

        for (var levelList : levels) {
            System.out.println(levelList);
        }

    }
}
