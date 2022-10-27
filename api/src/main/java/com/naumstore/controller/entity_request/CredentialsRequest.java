package com.naumstore.controller.entity_request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@Schema(description = "lol")
public class CredentialsRequest {

    @Size(min = 4, message = "User name length must be greater than or equals to 4")
    @Size(max = 20, message = "User name length must be less than or equal to 20")
    @Pattern(regexp = "^[A-Za-z]\\w{3,49}$", message = "User name length must be greater than or equal to 4 and" +
            "must be less than or equal to 50. User name must start with letter and consist of A-Z, a-z, 0-9 and _")
    @Schema(required = true, description = "user's login", defaultValue = "login", type = "string")
    private String login;

    @Size(min = 8, message = "User password length must be greater than or equals to 8")
    @Size(max = 16, message = "User password length must be less than or equal to 16")
    @Pattern(regexp = "^[A-Za-z][\\w#]{7,15}$", message = "User password length must be greater than or equal to 4 and" +
            "must be less than or equal to 50. User name must start with letter and consist of A-Z, a-z, 0-9 and _#")
    private String password;

    @Size(max = 100, message = "Email length must be less than or equal to 100")
    @Email(regexp = "^[A-Za-z][\\w.]+@[A-Za-z][A-Za-z0-9]+\\.[A-Za-z]{2,}$",
            message = "Email format [A-Za-z][\\w.]+@[A-Za-z][A-Za-z0-9]+\\.[A-Za-z]{2,}$")
    private String email;
}