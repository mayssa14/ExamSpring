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
public class User {
    @Id
    private int id;
    private String email;

    private String pwd;
    private String fName;
    private String IName;
    @Enumerated(EnumType.STRING)
    private Role role;


    @ManyToMany(mappedBy ="user")
    private Collection<Project> project ;

    @OneToMany
    private   Collection<Project> prj ;
}


