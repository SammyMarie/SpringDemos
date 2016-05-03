package uk.co.sammy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by smlif on 03/05/2016.
 */
@Controller
@RequestMapping("/project")
public class ProjectController {

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addProject(){
        System.out.println("Invoking addProject");
        return "project_add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String saveProject(){
        System.out.println("Invoking saveProject");
        return "project_add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, params = {"type=multi"})
    public String saveMultiYearProject(){
        System.out.println("Invoking saveMultiYearProject");
        return "project_add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, params = {"type=multi","special"})
    public String saveSpecialProject(){
        System.out.println("Invoking saveSpecialProject");
        return "project_add";
    }
}
