package pl.sda.springtraining;

import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Setter
public class User {

    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String pesel;
    private String username;
    private String passwordHash;
    private String phone;

    @OneToOne
    private UserAddress userAddress;


}
