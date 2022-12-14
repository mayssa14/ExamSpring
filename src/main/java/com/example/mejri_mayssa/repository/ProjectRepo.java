package com.example.mejri_mayssa.repository;

import com.example.mejri_mayssa.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepo extends JpaRepository <Project,Integer> {

    public Project findByfNameAndIName(String fName, String IName);


}
