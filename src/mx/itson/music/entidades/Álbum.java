/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.music.entidades;

import java.util.List;
import mx.itson.music.enums.Género;

/**
 *
 * @author rocta
 */
public class Álbum {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the artista
     */
    public Artista getArtista() {
        return artista;
    }

    /**
     * @param artista the artista to set
     */
    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    /**
     * @return the lanzamiento
     */
    public int getLanzamiento() {
        return lanzamiento;
    }

    /**
     * @param lanzamiento the lanzamiento to set
     */
    public void setLanzamiento(int lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    /**
     * @return the canciones
     */
    public List<Canción> getCanciones() {
        return canciones;
    }

    /**
     * @param canciones the canciones to set
     */
    public void setCanciones(List<Canción> canciones) {
        this.canciones = canciones;
    }

    /**
     * @return the genero
     */
    public Género getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(Género genero) {
        this.genero = genero;
    }
    private String nombre;
    private Artista artista;
    private int lanzamiento;
    private List<Canción> canciones;
    private Género genero;
}
