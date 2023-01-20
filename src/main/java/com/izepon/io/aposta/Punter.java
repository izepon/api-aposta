package com.izepon.io.aposta;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Punter {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String mail;

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public Punter(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }
}
