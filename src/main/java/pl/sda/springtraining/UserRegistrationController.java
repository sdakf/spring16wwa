package pl.sda.springtraining;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserRegistrationController {

    @Autowired
    UserRegistrationService userRegistrationService;

//    @RequestMapping(value = "/registration",method = RequestMethod.GET)
    @GetMapping(value = "/registration")
    public String showForm(Model model){
        model.addAttribute("countries", Countries.values());
        model.addAttribute("userDTO", new UserRegistrationDTO());
        return "registrationForm"; //nazwa htmla
    }
    @PostMapping(value = "/registration")
    public String register(@ModelAttribute(name = "userDTO") UserRegistrationDTO DTO){
        userRegistrationService.registerUser(DTO);
        return "/";
    }

}
