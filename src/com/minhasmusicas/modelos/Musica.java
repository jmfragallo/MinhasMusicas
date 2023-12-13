package com.minhasmusicas.modelos;

import com.minhasmusicas.modelos.Audio;

public class Musica extends Audio {
    private String album;
    private  String genero;
    private String artista;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalDeCurtidas() > 500) {
            return 10;
        } else {
            return 7;
        }
    }
}
