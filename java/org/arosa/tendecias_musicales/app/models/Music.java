package org.arosa.tendecias_musicales.app.models;

import org.arosa.tendecias_musicales.app.models.music.Icono;

public abstract class Music {

    public Music(String nomArtista, String nomAlbum, String nomCancion, int reproducciones, int likes, int dislike, String anio) {
        this.nomArtista = nomArtista;
        this.nomAlbum = nomAlbum;
        this.nomCancion = nomCancion;
        this.reproduciones = reproducciones;
        this.likes = likes;
        this.dislike = dislike;
        this.anio = anio;
    }

    private String nomArtista;
    private String nomAlbum;
    private String nomCancion;
    private String icono;
    private int reproduciones;
    private int likes;
    private String anio;
    private int dislike;

    public String getNomArtista() {
        return nomArtista;
    }

    public String getNomAlbum() {
        return nomAlbum;
    }

    public String getNomCancion() {
        return nomCancion;
    }

    public String getIcono() {
        return icono;
    }

    public int getReproduciones() {
        return reproduciones;
    }

    public int getLikes() {
        return likes;
    }

    public String getAnio() {
        return anio;
    }

    public int getDislike() {
        return dislike;
    }

    public void setNomArtista(String nomArtista) {
        this.nomArtista = nomArtista;
    }

    public void setNomAlbum(String nomAlbum) {
        this.nomAlbum = nomAlbum;
    }

    public void setNomCancion(String nomCancion) {
        this.nomCancion = nomCancion;
    }

    public void setReproduciones(int reproduciones) {
        this.reproduciones = reproduciones;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public void setDislike(int dislike) {
        this.dislike = dislike;
    }

    public void setIcono(String icono){
        this.icono = icono;
    }
}
