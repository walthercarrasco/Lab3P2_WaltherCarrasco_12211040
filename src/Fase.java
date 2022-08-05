

public class Fase extends Cohete{
    private int fases;
    private int motores;
    private double altura;

    public Fase(int fases, int motores, double altura, double peso_soportable, String nombre, int serie, int potencia) {
        super(peso_soportable, nombre, serie, potencia);
        this.fases = fases;
        this.motores = motores;
        this.altura = altura;
    }

    public Fase() {
        super();
    }

    public int getFases() {
        return fases;
    }

    public void setFases(int fases) {
        this.fases = fases;
    }

    public int getMotores() {
        return motores;
    }

    public void setMotores(int motores) {
        this.motores = motores;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
}
