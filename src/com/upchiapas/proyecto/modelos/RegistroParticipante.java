package com.upchiapas.proyecto.modelos;

import java.util.LinkedList;
import java.util.Scanner;

public class RegistroParticipante {
    static Scanner entrada = new Scanner(System.in);
    Participante objectoPaticipante;
    Participante objectoPaticipant;

    Participante[] arregloParticipante;

    Participante[] plantaBaja;
    public void agregarParticipantes() {

        int folio;
        String nombre;
        String lugar;
        arregloParticipante = new Participante[5];
        plantaBaja = new Participante[3];
        for (int i = 0; i < 5; i++) {
            System.out.println("Planta Alta: " + (i + 1));
            System.out.println("INGRESA EL NOMBRE: ");
            nombre = entrada.next();
            System.out.println("INGRESA LUGAR: ");
            lugar = entrada.next();
            folio = (int) (Math.random() * 1000);
            System.out.println("Folio: " + folio);
            objectoPaticipante = new Participante(nombre, lugar, folio);
            arregloParticipante[i] = objectoPaticipante;
        }
        System.out.println("Planta Alta llena");
        for (int i = 0; i < 3; i++) {
            System.out.println("Planta Baja: " + (i + 1));
            System.out.println("INGRESA EL NOMBRE: ");
            nombre = entrada.next();
            System.out.println("INGRESA LUGAR: ");
            lugar = entrada.next();
            folio = (int) (Math.random() * 1000);
            System.out.println("Folio: " + folio);
            objectoPaticipant = new Participante(nombre, lugar, folio);
            plantaBaja[i] = objectoPaticipant;
        }
        System.out.println("Planta Baja llena");

    }
}

