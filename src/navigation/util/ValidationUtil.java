package navigation.util;

import navigation.annotation.NotBlank;
import navigation.data.LoginRequest;
import navigation.error.BlankException;
import navigation.error.ValidationException;

import java.lang.reflect.Field;

public class ValidationUtil {
    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationException("Username is blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new ValidationException("Password is blank");
        }
    }

    public static void validateRuntime(LoginRequest loginRequest) {
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new BlankException("Username is blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new BlankException("Password is blank");
        }
    }

    public static void validationNotBlank(Object o){
        Class aClass = o.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (var field : fields) {
            field.setAccessible(true);
            if (field.getAnnotation(NotBlank.class) != null){
                try {
                    String value = (String) field.get(o);
                    if (value == null || value.isBlank()){
                        throw new BlankException("Field: " + field.getName() + " is Blank");
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                    System.out.println("Cannot access field: " + field.getName());
                }
            }
        }

    }
}
