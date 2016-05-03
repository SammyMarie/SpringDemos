package uk.co.sammy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by smlif on 03/05/2016.
 */
@Controller
public class HomeController {

    @RequestMapping("/index")
    public String goHome(){
        return "index";
    }
}
