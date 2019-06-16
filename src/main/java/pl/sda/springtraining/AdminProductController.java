package pl.sda.springtraining;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@Controller
public class AdminProductController {

    @Autowired
    ProductService productService;

    public String addProduct(
            @RequestParam String productName,
            @RequestParam Long stockAmount,
            @RequestParam String url,
            @RequestParam BigDecimal price,
            @RequestParam ProductType productType) {
        productService.addProduct(productName, stockAmount, url, price, productType);


    }
}
