package navigation.data;

public record LoginRequest(String username, String password) {
    public LoginRequest {
        System.out.println("Create login req...");
    }

    public LoginRequest(String username) {
        this(username, "");
    }

    public LoginRequest() {
        this("", "");
    }

    public void sayHelloTo(String username) {
        System.out.println("Hello " + username + ", My name is " + this.username);
    }
}
