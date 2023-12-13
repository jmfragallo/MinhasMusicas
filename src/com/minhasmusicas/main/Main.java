package com.minhasmusicas.main;

import com.minhasmusicas.modelos.MinhasPreferidas;
import com.minhasmusicas.modelos.Musica;
import com.minhasmusicas.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica music1 = new Musica();
        music1.setTitulo("Amanheceu");
        music1.setArtista("Scalene");

        for (int i = 0; i < 5000; i++) {
            music1.reproduzir();
        }

        for (int i = 0; i < 300; i++) {
            music1.curtir();
        }

        Podcast pod1 = new Podcast();
        pod1.setTitulo("Pod pá");
        pod1.setApresentador("Igão");
        for (int i = 0; i < 5000; i++) {
            pod1.reproduzir();
        }

        for (int i = 0; i < 300; i++) {
            pod1.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(music1);
        preferidas.inclui(pod1);




    }
}
