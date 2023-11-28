package com.example.pethotelapp.controller;

import com.example.pethotelapp.dto.AnimalDto;
import com.example.pethotelapp.model.AnimalModel;
import com.example.pethotelapp.model.UserModel;
import com.example.pethotelapp.service.AnimalService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class AnimalController {
    private final AnimalService animalService;

    @PostMapping("/addAnimal")
    public ResponseEntity<AnimalDto> addAnimal(@RequestBody AnimalDto animalDto) {
        try {
            AnimalDto addAnimal = animalService.addAnimal(animalDto);
            return ResponseEntity.ok(addAnimal);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }
    @GetMapping("/animals")
    public List<AnimalModel> getAnimalList(AnimalModel animals){
        List<AnimalModel> animalList = animalService.getAnimalList();
        return animalList;
    }
}
