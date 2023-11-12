package org.arosa.tendecias_musicales.app.models;

import org.arosa.tendecias_musicales.app.models.music.AugeState;
import org.arosa.tendecias_musicales.app.models.music.Icono;
import org.arosa.tendecias_musicales.app.models.music.NormalState;
import org.arosa.tendecias_musicales.app.models.music.TendenciaState;

import javax.swing.*;

public class Cancion{
    public Cancion(String nomArtista, String nomAlbum, String nomCancion, int reproducciones, int likes, int dislike, String anio) {
        this.music = new Music(nomArtista, nomAlbum, nomCancion,reproducciones, likes, dislike, anio){};
        definirEstado();
    }
    private Music music;
    private MusicState estado;

    public void verLeyenda(){
        estado.showLegend();
    }

    private void definirEstado(){
        if(music.getReproduciones() > 50000 && music.getLikes() > 20000){
            estado = new TendenciaState(music);
            music.setIcono(Icono.FIRE.texto());

        }else if (music.getReproduciones() > 1000){
            estado = new AugeState(music);
            music.setIcono(Icono.ROCKET.texto());
        }else {
            estado =  new NormalState(music);
            music.setIcono(Icono.MUSICAL_NOTE.texto());
        }
    }

    public void actualizarEstado(int reproducciones, int likes, int dislike){
        music.setReproduciones(music.getReproduciones() + reproducciones);
        music.setLikes(music.getLikes() + likes);
        music.setDislike(music.getDislike() + dislike);

        if(reproducciones == 0){
            music.setIcono(Icono.MUSICAL_NOTE.texto());
            estado = new NormalState(music);
            estado.showLegend();
            System.out.println( music.getNomCancion() + "  era tendencia pero vuelve a ser normal por no ser escuchada en las últimas horas.");
        }else
            if(estado.getClass().getSimpleName().equals("AugeState") && dislike >= 5000){
            music.setIcono(Icono.MUSICAL_NOTE.texto());
            estado = new NormalState(music);
            estado.showLegend();
            System.out.println( music.getNomCancion() + " baja del auge por tener muchos dislikes.");
        }else
            if(estado.getClass().getSimpleName().equals("NormalState" ) && music.getReproduciones() > 1000 &&  music.getReproduciones() < 50000){
            music.setIcono(Icono.ROCKET.texto());
            estado = new AugeState(music);
            estado.showLegend();
            System.out.println(music.getNomCancion() + " está en auge por superar el mínimo de reproducciones esperadas.");
        }else
            if(music.getReproduciones() > 50000 && music.getLikes() > 20000){
            estado = new AugeState(music);
            music.setIcono(Icono.FIRE.texto());
            estado.showLegend();
            System.out.println("'" + music.getNomCancion() + "'" + " es tendencia por récord de reproducciones y cantidad de personas que le gusta el tema.");
        }else {
                estado.showLegend();
                System.out.println(music.getNomCancion() + "  recién se lanza (tiene popularidad normal).");
        }
    }
}
