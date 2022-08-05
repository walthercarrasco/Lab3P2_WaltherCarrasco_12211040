
public class Solido extends Cohete{
    private double kilos;
    private String material;

    public Solido() {
    }

    public Solido(double kilos, String material, double peso_soportable, String nombre, int serie, int potencia) {
        super(peso_soportable, nombre, serie, potencia);
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

    @Override
    public String toString() {
        return "Solido{" + "kilos=" + kilos + ", material=" + material + "}\n" + super.toString();
    }
    
    
}
