
public class Solido extends Cohete{
    private double kilos;
    private String material;

    public Solido() {
    }

    public Solido(double kilos, String material, double pesoSor, String nombre, int serie, int potencia, double velocidad) {
        super(pesoSor, nombre, serie, potencia, velocidad);
        this.kilos = kilos;
        this.material = material;
    }

    public double getKilos() {
        return kilos;
    }

    public void setKilos(double kilos) {
        this.kilos = kilos;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    
}
