package pl.sda.springtraining;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String pesel;
    private String username;
    private String password;
    private String phone;

    @OneToOne
    private UserAddress userAddress;

}
