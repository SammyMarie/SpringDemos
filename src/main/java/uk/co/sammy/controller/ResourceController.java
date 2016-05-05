package uk.co.sammy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by smlif on 05/05/2016.
 */
@Controller
@RequestMapping("/resource")
public class ResourceController {

    @RequestMapping(value = "/add")
    public String add(Model model){
        return "resource_add";
    }

    @RequestMapping(value = "/save")
    public String save(){
        System.out.println("Invoking the save() method.");
        return "resource_add";
    }
}
