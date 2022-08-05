
import java.util.Random;



public class Liquido extends Cohete{
    private double litro;

    public Liquido() {
        super();
    }

    public Liquido(double litro, double pesoSor, String nombre, int serie, int potencia, double velocidad) {
        super(pesoSor, nombre, serie, potencia, velocidad);
        this.litro = litro;
    }

    public double getLitro() {
        return litro;
    }

    public void setLitro(double litro) {
        this.litro = litro;
    }

    @Override
    public String toString() {
        return "Liquido{" + "litro=" + litro + '}';
    }


    
    
}
