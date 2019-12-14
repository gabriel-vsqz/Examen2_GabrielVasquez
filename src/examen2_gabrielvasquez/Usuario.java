package examen2_gabrielvasquez;

import java.io.Serializable;
import java.util.ArrayList;

public class Usuario implements Serializable {
    
    private String nombre;
    private int edad;
    private String correo;
    private String user;
    private String password;
    private Canal canal;
    private ArrayList<Canal> canales = new ArrayList();
    private Playlist favoritos;

    public Usuario() {
    }

    public Usuario(String nombre, int edad, String correo, String user, String password, Canal canal) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.user = user;
        this.password = password;
        this.canal = canal;
    }

    public Usuario(String nombre, int edad, String correo, String user, String password, Canal canal, Playlist favoritos) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.user = user;
        this.password = password;
        this.canal = canal;
        this.favoritos = favoritos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Canal getCanal() {
        return canal;
    }

    public void setCanal(Canal canal) {
        this.canal = canal;
    }

    public ArrayList<Canal> getCanales() {
        return canales;
    }

    public void setCanales(ArrayList<Canal> canales) {
        this.canales = canales;
    }

    public Playlist getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(Playlist favoritos) {
        this.favoritos = favoritos;
    }

//    @Override
//    public String toString() {
//        return nombre + "{Usuario: " + user + " - Canal: " + canal;
//    }

    @Override
    public String toString() {
        return nombre + ": Edad-" + edad + ",Correo-" + correo + ",Usuario-" + user + ",Contraseña-" + password + ",Canal-" + canal;
    }
    
}