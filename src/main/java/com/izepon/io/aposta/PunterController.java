package com.izepon.io.aposta;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
public class PunterController {

    @PostMapping("/apostador")
    public ResponseEntity savePunter(@RequestBody PunterIn punterIn){
        Punter punter = punterIn.toConvert();

        return ResponseEntity.status(CREATED).build();
    }
}
