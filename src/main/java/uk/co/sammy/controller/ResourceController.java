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
        List<String> items = new LinkedList<>(Arrays.asList(new String[]{
                "Material", "Staff", "Technical Equipment", "Other"
        }));

        List<String> radios = new LinkedList<>(Arrays.asList(new String[]{
                "Hours", "Piece", "Tons"
        }));

        List<String> checks = new LinkedList<>(Arrays.asList(new String[]{
                "Lead Time", "Special Rate", "Requires Approval"
        }));

        model.addAttribute("typeOptions", items);
        model.addAttribute("radioOptions", radios);
        model.addAttribute("checkOptions", checks);

        model.addAttribute("resource", new Resource());
        return "resource_add";
    }

    @RequestMapping(value = "/save")
    public String save(@ModelAttribute Resource resource){
        System.out.println(resource);
        return "redirect:/resource/add";
    }
}
