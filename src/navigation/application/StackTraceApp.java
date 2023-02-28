package navigation.application;

public class StackTraceApp {
    public static void main(String[] args) {
        try {
            String[] names = {
                    "Hilmi", "Akbar", "Muharrom"
            };
            System.out.println(names[20]);
        } catch (Throwable throwable) {
            StackTraceElement[] stackTraceElements = throwable.getStackTrace();
            throwable.printStackTrace();
        }
    }

    public static void sampleError() {
        try {
            String[] names = {
                "Hilmi", "Akbar", "Muharrom"
            };

            System.out.println(names[100]);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }
}
