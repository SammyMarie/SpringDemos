package uk.co.sammy.dao;

import uk.co.sammy.model.Project;
import uk.co.sammy.service.ProjectService;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by smlif on 03/05/2016.
 */
public class ProjectServiceImpl implements ProjectService {

    private List<Project> projects = new LinkedList<>();

    public ProjectServiceImpl(){
        Project javaProject = createProject("Java Project", "This is a Java project");
        Project javaScriptProject = createProject("JavaScript Project", "This is a JavaScript project");
        Project htmlProject = createProject("HTML Project", "This is an HTML project");

        projects.addAll(Arrays.asList(new Project[]{javaProject, javaScriptProject, htmlProject}));
    }

    @Override
    public Project find(Long projectId){
        return projects.stream().filter(p -> {
            return p.getProjectId().equals(projectId);
        }).collect(Collectors.toList()).get(0);
    }

    private Project createProject(String title, String description) {
        Project project = new Project();
        project.setName(title);
        project.setAuthorizedFunds(new BigDecimal("100000"));
        project.setAuthorizedHours(new BigDecimal("1000"));
        project.setProjectId(1L);
        project.setSpecial(false);
        project.setType("multi");
        project.setYear("2015");
        project.setDescription(description);
        return project;
    }

    @Override
    public List<Project> findAll(){
        return projects;
    }
}
