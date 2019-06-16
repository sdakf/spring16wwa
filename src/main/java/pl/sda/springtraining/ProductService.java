package pl.sda.springtraining;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public void addProduct(String productName, Long stockAmount, String url, BigDecimal price, ProductType productType) {

        Product product = Product.builder()
                .productType(productType)
                .productName(productName)
                .stockAmount(stockAmount)
                .price(price)
                .url(url)
                .build();

        productRepository.save(product);

    }
}
