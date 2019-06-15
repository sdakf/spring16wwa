package pl.sda.springtraining;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserRegistrationController {

//    @RequestMapping(value = "/registration",method = RequestMethod.GET)
    @GetMapping(value = "/registration")
    public String showForm(Model model){
        model.addAttribute("countries", Countries.values());
        model.addAttribute("userDTO", new UserRegistrationDTO());
        return "registrationForm"; //nazwa htmla
    }

}
