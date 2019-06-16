package pl.sda.springtraining;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRegistrationDTO {
    private String firstName;
    private String lastName;
    private String birthDate;
    private String pesel;
    private String username;
    private String password;
    private String phone;
    private String zipCode;
    private String city;
    private String street;
    private Countries country;

    public String getSomething(){
        return "";
    }
}
