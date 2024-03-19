package Clases;

public class Piloto  extends  Persona{
    private  int aniosAntiguedad;
    private  int matricula;

    public Piloto(int fechaNacimiento, String nombre, int aniosAntiguedad, int matricula) {
        super(fechaNacimiento, nombre);
        this.aniosAntiguedad = aniosAntiguedad;
        this.matricula = matricula;
    }

    public int getAniosAntiguedad() {
        return aniosAntiguedad;
    }

    public void setAniosAntiguedad(int aniosAntiguedad) {
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
