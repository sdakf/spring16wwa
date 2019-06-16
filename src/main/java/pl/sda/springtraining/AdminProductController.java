package pl.sda.springtraining;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@Controller
public class AdminProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/product")
    public String showProductForm(Model model){
        model.addAttribute("productTypes", ProductType.values());
        return "productForm";
    }

    @PostMapping("/product")
    public String addProduct(
            @RequestParam String productName,
            @RequestParam Long stockAmount,
            @RequestParam String url,
            @RequestParam BigDecimal price,
            @RequestParam ProductType productType) {
        productService.addProduct(productName, stockAmount, url, price, productType);
        return "redirect:/products";
    }
}
