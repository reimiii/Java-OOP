package navigation.data;

import navigation.annotation.NotBlank;

public class CreateUserRequest {
    @NotBlank
    private String username;

    @NotBlank
    private String password;
    @NotBlank
    private String location;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
