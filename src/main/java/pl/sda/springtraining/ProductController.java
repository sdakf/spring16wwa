package pl.sda.springtraining;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @RequestMapping("/products")
    public String productList(Model model) {
        model.addAttribute("productList", productRepository.findAll());
        return "productsList";
    }
}
