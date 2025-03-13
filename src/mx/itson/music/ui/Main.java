/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.music.ui;

import java.util.ArrayList;
import java.util.List;
import mx.itson.music.entidades.Artista;
import mx.itson.music.entidades.Canción;
import mx.itson.music.entidades.Álbum;
import mx.itson.music.enums.Género;

/**
 *
 * @author rocta
 */
public class Main {
    
    public static void main(String[] args) {
        
        Artista artista = new Artista();
        artista.setNombre("Linkin Park");
        artista.setSitioWeb("www.linkinpark.com");
        
        
        Álbum a = new Álbum();
        a.setArtista(artista);
        a.setNombre("Hybrid Theory");
        a.setLanzamiento(2000);
        a.setGenero(Género.ROCK);
        
        List<Canción> canciones = new ArrayList<>();
        
    }
}
