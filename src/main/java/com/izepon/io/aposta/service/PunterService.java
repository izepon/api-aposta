package com.izepon.io.aposta.service;

import com.izepon.io.aposta.model.Punter;
import com.izepon.io.aposta.model.dto.PunterIn;
import com.izepon.io.aposta.repository.PunterRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PunterService {

    private final PunterRepository punterRepository;
    private final ModelMapper modelMapper;

    public void savePunter(PunterIn punterIn) {
        Punter punter = modelMapper.map(punterIn, Punter.class);
        punterRepository.save(punter);

    }
}
