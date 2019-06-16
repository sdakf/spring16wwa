package pl.sda.springtraining;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @RequestMapping("/products")
    public String productList(@RequestParam(required = false) String searchText, Model model) {
        if (StringUtils.isBlank(searchText)) {
            model.addAttribute("productsList", productRepository.findAll());
        } else {
            model.addAttribute("productsList", productRepository.findAllByNameLike(searchText));
        }
        return "productsView";
    }
}