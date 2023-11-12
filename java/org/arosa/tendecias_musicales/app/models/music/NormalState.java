package org.arosa.tendecias_musicales.app.models.music;

import org.arosa.tendecias_musicales.app.models.Music;
import org.arosa.tendecias_musicales.app.models.MusicState;

public class NormalState implements MusicState {
    public NormalState(Music music) {
        this.music = music;
    }

    private Music music;

    public void showLegend(){
        StringBuilder sb = new StringBuilder(music.getNomArtista() + " - ");
        sb.append(music.getNomAlbum() + " - ");
        sb.append(music.getNomCancion() + "(" + music.getIcono() + ")");

        System.out.println(sb.toString());
    }
}
