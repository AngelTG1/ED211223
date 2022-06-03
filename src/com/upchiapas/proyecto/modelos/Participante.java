package com.upchiapas.proyecto.modelos;

public class Participante {
    private String nombre;
    private String lugar;
    private int folio;

    public Participante(String nombre, String lugar, int folio) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.folio = folio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }
}
