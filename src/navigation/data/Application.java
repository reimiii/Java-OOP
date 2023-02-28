package navigation.data;

public class Application {
    public static final int PROCESSORS;

    static {
        System.out.println("Mengakses...");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
