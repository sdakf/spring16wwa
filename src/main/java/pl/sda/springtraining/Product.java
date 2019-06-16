package pl.sda.springtraining;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue
    private Integer id;

    private String productName;
    private Long stockAmount;
    private String url;
    private BigDecimal price;
    @Enumerated(EnumType.STRING)
    private ProductType productType;

}
