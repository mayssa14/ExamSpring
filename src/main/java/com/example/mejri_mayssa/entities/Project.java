package com.example.mejri_mayssa.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Project {
    @Id
    private int id;
    private String title;
    private String description;


    @ManyToMany
    private Collection<User> user ;

    @OneToMany(mappedBy = "project")
    private Collection<Sprint> sprint;
}

