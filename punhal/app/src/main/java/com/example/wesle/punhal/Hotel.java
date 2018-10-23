package com.example.wesle.punhal;

import javax.inject.Inject;
import javax.inject.Singleton;


public class Hotel {
    private String nome;
    private int estrelas;

    @Inject
    Hotel() {
    }

    String getNome() {
        return nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    public int getEstrelas() {
        return estrelas;
    }

    public void setEstrelas(int estrelas) {
        this.estrelas = estrelas;
    }
}
