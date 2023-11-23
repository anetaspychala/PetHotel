package com.example.pethotelapp.mapper;

import com.example.pethotelapp.dto.OwnerDto;
import com.example.pethotelapp.model.OwnerModel;

public class OwnerMapper {
    public static OwnerDto toOwnerDto(OwnerModel ownerModel){
        OwnerDto ownerDto = new OwnerDto();
        ownerDto.setFirstName(ownerModel.getFirstName());
        ownerDto.setLastName(ownerModel.getLastName());
        ownerDto.setPhone(ownerModel.getPhone());
        ownerDto.setEmail(ownerModel.getEmail());
        ownerDto.setLogin(ownerModel.getLogin());
        ownerDto.setPassword(ownerModel.getPassword());
        //ownerDto.setAnimals(ownerModel.getAnimals());
        return ownerDto;}

    public static OwnerModel toOwnerModel(OwnerDto ownerDto){
        OwnerModel ownerModel = new OwnerModel();
        ownerModel.setFirstName(ownerDto.getFirstName());
        ownerModel.setLastName(ownerDto.getLastName());
        ownerModel.setPhone(ownerDto.getPhone());
        ownerModel.setEmail(ownerDto.getEmail());
        ownerModel.setLogin(ownerDto.getLogin());
        ownerModel.setPassword(ownerDto.getPassword());
        //ownerModel.setAnimals(ownerDto.getAnimals());
    return ownerModel;}
}
