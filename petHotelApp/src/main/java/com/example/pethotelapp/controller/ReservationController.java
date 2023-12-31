package com.example.pethotelapp.controller;

import com.example.pethotelapp.dto.ReservationDto;
import com.example.pethotelapp.model.ReservationModel;
import com.example.pethotelapp.model.UserModel;
import com.example.pethotelapp.service.ReservationService;
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
public class ReservationController {
    private final ReservationService reservationService;
    @PostMapping("/addReservation")
    public ResponseEntity<ReservationDto> addReservation(@RequestBody ReservationDto reservationDto) {
        try {
            ReservationDto addReservation = reservationService.addReservation(reservationDto);
            return ResponseEntity.ok(addReservation);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @GetMapping("/reservations")
    public List<ReservationModel> getReservationList(ReservationModel reservation){
        List<ReservationModel> reservationList = reservationService.getReservationList();
        return reservationList;
    }
}
