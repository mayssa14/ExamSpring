package com.example.mejri_mayssa.services;


import com.example.mejri_mayssa.entities.Project;
import com.example.mejri_mayssa.entities.Sprint;
import com.example.mejri_mayssa.entities.User;
import com.example.mejri_mayssa.repository.ProjectRepo;
import com.example.mejri_mayssa.repository.SprintRepo;
import com.example.mejri_mayssa.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class iServiceUserIMPL {
    @Autowired
    UserRepo userRepo;

    @Autowired
    ProjectRepo projectRepo;
    @Autowired
    SprintRepo sprintRepo;


    public User addUser(User user) {
        return userRepo.save(user);
    }


    public Project addProject(Project project) {
        return projectRepo.save(project);
    }


    public void AssignProjectToUser(int projectId, int userId) {
        User user = userRepo.findById(userId).get();
        Project projct = projectRepo.findById(projectId).get();
        if ((user!=null)&&(projct!=null))
        {
            projct.getUser().add(user);
            projectRepo.save(projct);
        }

    }

    public List<Project> retrieveAllContrats() {

        return projectRepo.findAll();
    }


    @Transactional
    public Project addSprintAndAssignToProject(Spring sprint, int idProject) {
        Project project = projectRepo.findById(idProject).orElse(null);

        if (project != null) {
            List<Project> projects = new ArrayList<Project>();
            projects.add(project);
          //  sprint.setProject(projects);
           // Sprint sprint1 = sprintRepo.save(sprint);

        }
        return sprint;
    }

}
