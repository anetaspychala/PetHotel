package com.example.pethotelapp.dto;

import com.example.pethotelapp.model.RoleModel;
import lombok.Data;

import java.util.Set;


@Data
public class UserDto {

    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private Long phone;

    private String login;

    private String password;

    private Set<RoleModel> roles;

  //  private List<AnimalModel> animals;

    //private List<Long> reservationsIds;
}
