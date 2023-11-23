package com.example.pethotelapp.service;

import com.example.pethotelapp.dto.AnimalDto;
import com.example.pethotelapp.dto.OwnerDto;
import com.example.pethotelapp.mapper.AnimalMapper;
import com.example.pethotelapp.mapper.OwnerMapper;
import com.example.pethotelapp.model.AnimalModel;
import com.example.pethotelapp.model.OwnerModel;
import com.example.pethotelapp.repository.AnimalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AnimalService {
    private final AnimalRepository animalRepository;

    public AnimalDto addAnimal(AnimalDto animalDto){
        AnimalModel animalModel = AnimalMapper.toAnimalModel(animalDto);
        AnimalModel addAnimal = animalRepository.save(animalModel);
        return AnimalMapper.toAnimalDto(addAnimal);
    }
}
