package examen2_gabrielvasquez;

import java.util.ArrayList;

public class Canal {
    
    private int suscriptores;
    private String nombre;
    private String categoria;
    private int videos;
    private int likes;
    private ArrayList<Video> propios;

    public Canal() {
    }

    public Canal(int suscriptores, String nombre, String categoria, int videos, int likes, ArrayList<Video> propios) {
        this.suscriptores = suscriptores;
        this.nombre = nombre;
        this.categoria = categoria;
        this.videos = videos;
        this.likes = likes;
        this.propios = propios;
    }

    public int getSuscriptores() {
        return suscriptores;
    }

    public void setSuscriptores(int suscriptores) {
        this.suscriptores = suscriptores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getVideos() {
        return videos;
    }

    public void setVideos(int videos) {
        this.videos = videos;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public ArrayList<Video> getPropios() {
        return propios;
    }

    public void setPropios(ArrayList<Video> propios) {
        this.propios = propios;
    }

    @Override
    public String toString() {
        return nombre + " - Suscriptores: " + suscriptores;
    }
    
}