package uk.co.sammy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import uk.co.sammy.model.Project;

/**
 * Created by smlif on 03/05/2016.
 */
@Controller
public class HomeController {

    @RequestMapping("/index")
    public String goHome(Model model){

        Project project = new Project();
        project.setName("First Project");
        project.setSponsor("NASA");
        project.setDescription("This is a project sponsored by NASA");

        model.addAttribute("currentProject", project);

        return "index";
    }
}
