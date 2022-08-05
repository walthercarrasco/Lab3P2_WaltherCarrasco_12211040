
public class Rocoso {
    private double densidad;
    private boolean vida;

    public Rocoso(double densidad, boolean vida) {
        this.densidad = densidad;
        this.vida = vida;
    }

    public Rocoso() {
    }

    public double getDensidad() {
        return densidad;
    }

    public void setDensidad(double densidad) {
        this.densidad = densidad;
    }

    public boolean isVida() {
        return vida;
    }

    public void setVida(boolean vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Rocoso{" + "densidad=" + densidad + ", vida=" + vida + '}';
    }
    
    
}
