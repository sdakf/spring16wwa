package pl.sda.springtraining;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
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
