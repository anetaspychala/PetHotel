package com.example.pethotelapp.controller;

import com.example.pethotelapp.dto.AnimalDto;
import com.example.pethotelapp.dto.OwnerDto;
import com.example.pethotelapp.service.AnimalService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}
