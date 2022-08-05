
import java.util.ArrayList;



public class Planeta {
    private String nombre;
    private double masa;
    private double radio;
    private double temperatura;
    private double velocidad;
    private ArrayList<Luna> lunas = new ArrayList<>();
    private Object tipo;

    public Planeta() {
    }

    public Planeta(String nombre, double masa, double radio, double temperatura, Object tipo) {
        this.nombre = nombre;
        this.masa = masa;
        this.radio = radio;
        this.temperatura = temperatura;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getVelocidad() {
        velocidad = Math.sqrt((2 * (6.67 * (Math.pow(10, -11))) * masa)/radio);
        return velocidad;
    }

    public ArrayList<Luna> getLunas() {
        return lunas;
    }

    public void setLunas(ArrayList<Luna> lunas) {
        this.lunas = lunas;
    }

    public Object getTipo() {
        return tipo;
    }

    public void setTipo(Object tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Planeta{" + "nombre=" + nombre + ", masa=" + masa + ", radio=" + radio + ", temperatura=" + temperatura + ", velocidad=" + velocidad + ", lunas=" + lunas + "}\n" + tipo.toString();
    }
    
}
