package ie.atu.Project_1;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Valid
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Max(value = 9, message = "id cannot be greater than 8")
    private String id;
@NotBlank(message = "Username is required")
    private String username;
    @NotBlank(message = "Password is required")
    private String password;

}
