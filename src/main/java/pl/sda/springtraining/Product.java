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
public class Product extends BaseEntity{

    private String productName;
    private Long stockAmount;
    private String url;
    private BigDecimal price;
    @Enumerated(EnumType.STRING)
    private ProductType productType;

}
