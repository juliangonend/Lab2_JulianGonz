package Clases;

public class Vuelo {
    private int capacidadDisponible;
    private int codVuelo;

    private Avion avion;

    public Vuelo(int capacidadDisponible, int codVuelo, Avion avion) {
        this.capacidadDisponible = capacidadDisponible;
        this.codVuelo = codVuelo;
        this.avion = avion;
    }
}
