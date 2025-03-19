/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.music.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
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
        
        // Instancias
        Scanner sc = new Scanner(System.in);
        Artista artista = new Artista();
        Álbum a = new Álbum();
        
        try {
        // ARTISTA
        // Nombre
        System.out.println("Escribe el nombre del artista:");
        String nombreArtista = sc.nextLine();
        artista.setNombre(nombreArtista);
        
        // Sitio Web
        System.out.println("Escribe la descripción del artista:");
        String sitioArtista = sc.nextLine();
        artista.setSitioWeb(sitioArtista);
        
        // Descripción
        System.out.println("Escribe la descripción del artista:");
        String descripcionArtista = sc.nextLine();
        artista.setDescripcion(descripcionArtista);
        
        // ÁLBUM
        a.setArtista(artista);
        
        // Nombre 
        System.out.println("Escribe el nombre del álbum:");
        String nombreAlbum = sc.nextLine();
        a.setNombre(nombreAlbum);
        
        // Lanzamiento
        System.out.println("Escribe el año de lanzamiento del álbum:");
        int lanzamientoAlbum = sc.nextInt();
        sc.nextLine();
        a.setLanzamiento(lanzamientoAlbum);
        
        // Género
        System.out.println("Los géneros disponibles son:");
        
        // Imprime los valores del enum Género
        for (Género g : Género.values()) {
            System.out.println(g);
        }
        
        Género generoAlbum = null;
        while (true) {
            
            try {
                System.out.println("Escribe el género del álbum:");
                String entrada = sc.nextLine().toUpperCase(); // Convierte el input a maýusculas
                generoAlbum = Género.valueOf(entrada);
                a.setGenero(generoAlbum);
                break;
            } catch (IllegalArgumentException e) { // Excepción para valor inválido
                System.err.println("Género inválido. Intente de nuevo.");
                continue;
            }
        }
        
        
        // Lista de canciones
        List<Canción> canciones = new ArrayList<>();
        
        int agregarCancion = 0;
        while (true) {                
            try {
                System.out.println("¿Quiere agregar una canción al álbum? 1: Sí, 0: No.");
                agregarCancion = sc.nextInt();
                sc.nextLine();
                while (agregarCancion == 1) {
                    Canción cancion = new Canción();
            
                    System.out.println("Escribe el nombre de la canción:");
                    String nombreCancion = sc.nextLine();
                    cancion.setNombre(nombreCancion);

                    System.out.println("Escribe la duración de la canción:");
                    int duracionCancion = sc.nextInt();
                    sc.nextLine();
                    cancion.setDuracion(duracionCancion);

                    System.out.println("Escribe el número del orden de la canción:");
                    int ordenCancion = sc.nextInt();
                    sc.nextLine();
                    cancion.setOrden(ordenCancion);

                    canciones.add(cancion);

                    while (true) {                
                        try {
                            System.out.println("¿Quiere agregar otra canción al álbum? 1: Si, 0: No.");
                            agregarCancion = sc.nextInt();
                            sc.nextLine();
                            break;
                        } catch (Exception e) {
                            System.err.println("Valor inválido. Intente de nuevo");
                            continue;
                        }
 
                    }

                }
                break;
            } catch (Exception e) {
                System.err.println("Valor inválido. Intente de nuevo");
                continue;
            }
        }
        
        System.out.println("\n ARTISTA:");
        System.out.println("Nombre: " + artista.getNombre());
        System.out.println("Descripción: " + artista.getDescripcion());
        System.out.println("Sitio Web: " + artista.getSitioWeb());
        
        System.out.println("\n ALBUM:");
        System.out.println("Nombre: " + a.getNombre());
        System.out.println("Artista: " + a.getArtista().getNombre());
        System.out.println("Lanzamiento: " + a.getLanzamiento());
        System.out.println("Genero: " + a.getGenero());
        
        System.out.println("\n CANCIONES:");
        for (Canción c : canciones) {
            System.out.println("Nombre: " + c.getNombre());
            System.out.println("Duracion: " + c.getDuracion());
            System.out.println("Orden: " + c.getOrden() + "\n");
        }
        } catch (Exception e) {
            System.err.println("Ha sucedido un error inesperado.");
        }
        /*
        Canción canción1 = new Canción();
        canción1.setNombre("Crawling");
        canción1.setOrden(1);
        canción1.setDuracion(209);
        
        Canción canción2 = new Canción();
        canción2.setNombre("In The End");
        canción2.setOrden(2);
        canción2.setDuracion(212);
        
        
        canciones.add(canción1);
        canciones.add(canción2);
       
        a.setCanciones(canciones);
        */
        
        
    }
}
