
import java.util.Random;



public class Liquido extends Cohete{
    private double litro;

    public Liquido() {
        super();
    }

    public Liquido(double litro, double peso_soportable, String nombre, int serie, int potencia) {
        super(peso_soportable, nombre, serie, potencia);
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
