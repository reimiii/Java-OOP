package navigation.application;

import navigation.data.LoginRequest;
import navigation.error.ValidationException;
import navigation.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("null", "null");

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        } catch (ValidationException | NullPointerException exception) {
            System.out.println("Data tidak valid: " + exception.getMessage());
        } finally {
            System.out.println("Selalu di jalankan");
        }

        LoginRequest loginRequest1 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest1);
        System.out.println("Success");
    }
}
