package uk.co.sammy.service;

import uk.co.sammy.model.Project;
import java.util.List;

/**
 * Created by smlif on 06/05/2016.
 */
public interface ProjectService {
    Project find(Long projectId);
    List<Project> findAll();
}
