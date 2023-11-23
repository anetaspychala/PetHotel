package com.example.pethotelapp.controller;

import com.example.pethotelapp.dto.OwnerDto;
import com.example.pethotelapp.service.OwnerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@Slf4j
public class OwnerController {
    private final OwnerService ownerService;

    @PostMapping("/addOwner")
    public ResponseEntity<OwnerDto> addOwner(@RequestBody OwnerDto ownerDto) {
        try {
            OwnerDto addOwner = ownerService.addOwner(ownerDto);
            return ResponseEntity.ok(addOwner);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }
}