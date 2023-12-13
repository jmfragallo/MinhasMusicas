package com.minhasmusicas.modelos;

import com.minhasmusicas.modelos.Audio;

public class Podcast extends Audio {
    private String apresentador;
    private String descricao;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getClassificacao() {
        if(this.getTotalDeCurtidas() > 300) {
            return 10;
        } else {
            return 7;
        }
    }
}
