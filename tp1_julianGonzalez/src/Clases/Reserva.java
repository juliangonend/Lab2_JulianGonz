package Clases;

public class Reserva {
    private String origen;
    private  String destino;
    private int numeroAsiento;
    private int precio;

    private  Vuelo vuelo;

    public Reserva(String origen, String destino, int numeroAsiento, int precio, Vuelo vuelo) {
        this.origen = origen;
        this.destino = destino;
        this.numeroAsiento = numeroAsiento;
        this.precio = precio;
        this.vuelo = vuelo;
    }
}
