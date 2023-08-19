/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rocio Lopez
 */
public class Main {
public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("Película", 120, 12, "Director Nombre");
        Espectador espectador = new Espectador("Nombre Espectador", 20, 50);
        Cine cine = new Cine(pelicula, 10, 8, 9);

        cine.venderEntrada(espectador, 5, 3);
        cine.mostrarAsientos();
    }
}    

