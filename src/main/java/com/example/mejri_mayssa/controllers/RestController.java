package com.example.mejri_mayssa.controllers;

import com.example.mejri_mayssa.entities.Project;
import com.example.mejri_mayssa.entities.User;
import com.example.mejri_mayssa.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("controller")

public class RestController {


    @Autowired
    IUserService iUserService;


    @PostMapping("/addU")
    public User addUser (@RequestBody User user)
    {
        return  iUserService.addUser(user);
    }

    @PostMapping("/addP")
    public Project AddProjct (@RequestBody Project project)
    {
        return  iUserService.addProject(project);
    }


    @PutMapping("/{idU}/{idD}")
    public void AssignProjectToUser(@PathVariable(value = "idU") Integer userId, @PathVariable(value = "idP") Integer projectId) {
        iUserService.AssignProjectToUser(userId, projectId);
    }

    @GetMapping("getAll")
    public List<Project> getAllCurrentProjct()
    {
        return iUserService.getAllCurrentProjectS();
    }


}
