package navigation.data;

public enum Level {
    STANDARD("Regular level"),
    PREMIUM("Premium level"),
    SUPER("Super anda Special :)");

    private final String description;

    Level(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
