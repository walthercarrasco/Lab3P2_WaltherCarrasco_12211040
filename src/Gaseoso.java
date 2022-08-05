
public class Gaseoso {
    private double presion;
    private int anillos;

    public Gaseoso() {
    }

    public Gaseoso(double presion, int anillos) {
        this.presion = presion;
        this.anillos = anillos;
    }

    public double getPresion() {
        return presion;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }

    public int getAnillos() {
        return anillos;
    }

    public void setAnillos(int anillos) {
        this.anillos = anillos;
    }

    @Override
    public String toString() {
        return "Gaseoso{" + "presion=" + presion + ", anillos=" + anillos + '}';
    }
}
