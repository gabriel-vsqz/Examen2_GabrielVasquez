package examen2_gabrielvasquez;

import java.io.Serializable;
import java.util.ArrayList;

public class Video implements Serializable {
    
    private String nombre;
    private int rept;
    private int likes;
    private int dislikes;
    private ArrayList<String> comments = new ArrayList();
    private ArrayList<String> subtitulos = new ArrayList();

    public Video() {
    }

    public Video(String nombre, int rept, int likes, int dislikes) {
        this.nombre = nombre;
        this.rept = rept;
        this.likes = likes;
        this.dislikes = dislikes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRept() {
        return rept;
    }

    public void setRept(int rept) {
        this.rept = rept;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public ArrayList<String> getComments() {
        return comments;
    }

    public void setComments(ArrayList<String> comments) {
        this.comments = comments;
    }

    public ArrayList<String> getSubtitulos() {
        return subtitulos;
    }

    public void setSubtitulos(ArrayList<String> subtitulos) {
        this.subtitulos = subtitulos;
    }

    @Override
    public String toString() {
        return nombre + " - " + rept;
    }
    
    
    
}