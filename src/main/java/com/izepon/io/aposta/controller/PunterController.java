package com.izepon.io.aposta.controller;

import com.izepon.io.aposta.model.dto.PunterIn;
import com.izepon.io.aposta.service.PunterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RequiredArgsConstructor
@RestController
public class PunterController {

    private final PunterService punterService;

    @PostMapping("/apostador")
    public ResponseEntity savePunter(@RequestBody PunterIn punterIn){
        punterService.savePunter(punterIn);

        return ResponseEntity.status(CREATED).build();
    }
}