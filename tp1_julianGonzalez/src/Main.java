import Clases.*;

public class Main {
    public static void main(String[] args) {
        Piloto piloto1= new Piloto(21062004,"Julian Gonzalez ", 13 , 32143421);
        Avion avion1= new Avion(2013,203,"Boing 737");
        Flota flotaMendoza= new Flota("Mendoza");
        flotaMendoza.addAviones(avion1);
        Vuelo mdzBsAS= new Vuelo(250,3242);
        mdzBsAS.setAvion(avion1);
        mdzBsAS.getAvion();
        Cliente cliente1 = new Cliente(210604,"Pepe", 1);
        Reserva reservaMdzBsAS= new Reserva("Mendoza","Buenos Aires", 15, 2500,cliente1, mdzBsAS);
        reservaMdzBsAS.imprimirReserva();
        piloto1.Volar();
   }
}