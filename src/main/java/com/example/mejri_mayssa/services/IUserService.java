package com.example.mejri_mayssa.services;

import com.example.mejri_mayssa.entities.Project;
import com.example.mejri_mayssa.entities.Sprint;
import com.example.mejri_mayssa.entities.User;

import java.util.List;

public interface IUserService {

     User addUser (User user);
     Project addProject (Project project);

     void AssignProjectToUser (int projectId, int userId);

     List<Project> getAllCurrentProjectS();

     void addSprintAndAssignTOProject(Sprint sprint, int idProject);
}
