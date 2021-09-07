package springboot_petstore.app.pet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PetMainPageController {

    @RequestMapping(value = {"/", "/index", "/home"})
    public String getMainPage(){
        return "index";
    }

    @RequestMapping( "/contact")
    public String getContact(){
        return "contact";
    }

}
