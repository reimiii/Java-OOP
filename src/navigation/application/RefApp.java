package navigation.application;

import navigation.data.CreateUserRequest;
import navigation.util.ValidationUtil;

public class RefApp {
    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("Hilmi");
        request.setPassword("MIII");
        ValidationUtil.validationNotBlank(request);
    }
}
