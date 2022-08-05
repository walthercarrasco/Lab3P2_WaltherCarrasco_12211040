
import java.util.ArrayList;
import java.util.Random;

public class Cohete {
    
    Random r = new Random();     
    public double peso_soportable;
    String nombre;
    int serie;
    int potencia;
    double velocidad;
    ArrayList<Persona> personas = new ArrayList<>();
    
    
    public Cohete() {
    }

    public Cohete(double peso_soportable, String nombre, int serie, int potencia, double velocidad) {
        this.peso_soportable = peso_soportable;
        this.nombre = nombre;
        this.serie = serie;
        this.potencia = potencia;
        this.velocidad = velocidad;
    }

    public double getPesoSor() {
        return peso_soportable;
    }

    public void setPesoSor(double peso_soportable) {
        this.peso_soportable = peso_soportable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getVelocidad() {
        velocidad = ((5000+r.nextInt(20000)) * potencia);
        return velocidad;
    }

    @Override
    public String toString() {
        return "Cohete{" + "pesoSor=" + peso_soportable + ", nombre=" + nombre + ", serie=" + serie + ", potencia=" + potencia + ", velocidad=" + velocidad + '}';
    }
    
    
}
