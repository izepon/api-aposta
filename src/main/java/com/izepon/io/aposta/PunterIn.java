package com.izepon.io.aposta;

public class PunterIn {

    private String name;
    private String mail;

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public Punter toConvert() {
        return new Punter(name, mail);
    }
}
