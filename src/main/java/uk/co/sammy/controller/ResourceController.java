package uk.co.sammy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import uk.co.sammy.model.Resource;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by smlif on 05/05/2016.
 */
@Controller
@RequestMapping("/resource")
public class ResourceController {

    @RequestMapping(value = "/add")
    public String add(Model model){
        List<String> items = new LinkedList<>();
        items.add("Material");
        items.add("Staff");
        items.add("Technical Equipment");
        items.add("Other");
        model.addAttribute("typeOptions", items);
        model.addAttribute("resource", new Resource());
        return "resource_add";
    }

    @RequestMapping(value = "/save")
    public String save(@ModelAttribute Resource resource){
        System.out.println(resource);
        return "resource_add";
    }
}
