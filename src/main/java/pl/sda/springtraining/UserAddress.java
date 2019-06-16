package pl.sda.springtraining;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class UserAddress {

    @Id
    @GeneratedValue
    private Integer id;
    private String zipCode;
    private String city;
    private String street;
    @Enumerated(EnumType.STRING)
    private Countries country;
}
