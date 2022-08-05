
public class Luna {
    private String nombre;
    private int crateres;

    public Luna() {
    }

    public Luna(String nombre, int crateres) {
        this.nombre = nombre;
        this.crateres = crateres;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCrateres() {
        return crateres;
    }

    public void setCrateres(int crateres) {
        this.crateres = crateres;
    }

    @Override
    public String toString() {
        return "Luna{" + "nombre=" + nombre + ", crateres=" + crateres + '}';
    }
    
    
}
