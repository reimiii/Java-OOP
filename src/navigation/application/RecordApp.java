package navigation.application;

import navigation.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest(
                "Riko", "secret"
        );
        loginRequest.sayHelloTo("Hilmi");
        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("meeee"));
        System.out.println(new LoginRequest("miii", "password"));
    }
}
