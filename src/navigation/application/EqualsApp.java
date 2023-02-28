package navigation.application;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Hilmi";
        first = first + " " + "AM";

        System.out.println(first);

        String second = "Hilmi AM";
        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));

        String third = "Hilmi AM";

        System.out.println(third == second);

    }
}

