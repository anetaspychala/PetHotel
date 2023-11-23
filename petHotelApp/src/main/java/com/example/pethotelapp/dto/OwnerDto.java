package com.example.pethotelapp.dto;

import com.example.pethotelapp.model.AnimalModel;
import lombok.Data;

import java.util.List;


@Data
public class OwnerDto {

    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private Long phone;

    private String login;

    private String password;

  //  private List<AnimalModel> animals;

    //private List<Long> reservationsIds;
}
