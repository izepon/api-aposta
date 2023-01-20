package com.izepon.io.aposta.model.dto;

import com.izepon.io.aposta.model.Punter;
import lombok.Getter;

@Getter
public class PunterIn {

    private String name;
    private String mail;

    public Punter toConvert() {
        return new Punter(null, name, mail);
    }
}
