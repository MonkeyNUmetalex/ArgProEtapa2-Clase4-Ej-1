package org.arosa.tendecias_musicales.app.models.music;

import org.arosa.tendecias_musicales.app.models.Music;
import org.arosa.tendecias_musicales.app.models.MusicState;

public class AugeState implements MusicState {
    public AugeState(Music music) {
        this.music = music;
        this.anio = anio;
    }
    private Music music;
    private String anio;
    @Override
    public void showLegend() {
        StringBuilder sb = new StringBuilder(music.getNomArtista());
        sb.append(" - " + music.getNomCancion());
        sb.append("(" + music.getNomAlbum() + "-");
        sb.append(" - ");
        sb.append(music.getAnio() +")");
        sb.append("(" + music.getIcono() + ")");

        System.out.println(sb.toString());
    }
}
