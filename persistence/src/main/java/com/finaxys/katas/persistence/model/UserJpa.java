package com.finaxys.katas.persistence.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserJpa {
    
    public static final UserJpa NONE = new UserJpa();
    
    @Id
    @Column(name ="MAIL")
    private String mail;
    @Column(name ="PASSWORD")
    private String password;
    @Column(name ="FIRST_NAME")
    private String firstName;
    @Column(name ="LAST_NAME")
    private String lastName;
    @Column(name = "CANDIDATE")
    private boolean candidate;
    @Column(name = "CORPORATE")
    private boolean corporate;
    
    
}