package org.arosa.tendecias_musicales.app.models;

import org.arosa.tendecias_musicales.app.models.music.Icono;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TendenciasMusicalesApp {
    public static void main(String[] args) {
        String nomArt = "Coldplay";
        String anio = "2002";
        String nomAlbum = "A Rush of Blood to the head";
        String nomCancion = "The Scientist";
        int rep = 700;
        int likes = 200;
        int dislike = 0;


        Cancion pista1 = new Cancion(nomArt, nomAlbum, nomCancion, rep, likes, dislike,anio);

        System.out.println();
        pista1.actualizarEstado(50, 10, 5);

        rep = 500;
        likes = 2000;
        dislike = 150;

        System.out.println();
       pista1.actualizarEstado(rep, likes, dislike);


        rep = 25000;
        likes = 20200;
        dislike = 5500;

        System.out.println();
        pista1.actualizarEstado(rep, likes, dislike);


        rep = 30000;
        likes = 20200;
        dislike = 4800;

        System.out.println();
        pista1.actualizarEstado(rep, likes, dislike);

        rep = 0;// Sin reproducciones deja de ser tendencia.

        System.out.println();
        pista1.actualizarEstado(rep, likes, dislike);


    }
}
