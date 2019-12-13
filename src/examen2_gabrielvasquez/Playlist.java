package examen2_gabrielvasquez;

import java.io.Serializable;
import java.util.ArrayList;

public class Playlist implements Serializable {
 
    private ArrayList<Video> videos = new ArrayList();
    private int duracion;

    public Playlist() {
    }

    public Playlist(int duracion) {
        this.duracion = duracion;
    }

    public ArrayList<Video> getVideos() {
        return videos;
    }

    public void setVideos(ArrayList<Video> videos) {
        this.videos = videos;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "" + duracion;
    }
    
}