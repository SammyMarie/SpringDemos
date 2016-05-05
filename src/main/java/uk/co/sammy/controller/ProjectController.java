package uk.co.sammy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import uk.co.sammy.model.Project;
import uk.co.sammy.service.ProjectService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by smlif on 03/05/2016.
 */
@Controller
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;


    @RequestMapping(value = "/{projectId}")
    public String findProject(Model model, @PathVariable("projectId") Long projectId){
        model.addAttribute("project", projectService.find(projectId));
        return "project";
    }

    @RequestMapping(value = "/find")
    public String find(Model model){
        model.addAttribute("projects", projectService.findAll());
        return "projects";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addProject(HttpSession session){
        session.setAttribute("token", "12345");
        System.out.println("Invoking addProject");
        return "project_add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String saveProject(@ModelAttribute Project project){
        System.out.println(project);
        System.out.println("Invoking saveProject");
        return "project_add";
    }
}
