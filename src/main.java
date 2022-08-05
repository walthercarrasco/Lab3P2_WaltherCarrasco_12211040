
import java.util.ArrayList;



public class main {
    
    static ArrayList<Planeta> planetas = new ArrayList<>();
    static ArrayList<Cohete> cohetes = new ArrayList<>();
    
    public static void main (String[] args){
        //Planetas por defectos
        //1
        planetas.add(new Planeta("Vegeta", 60000000, 50000, 50, new Rocoso(5.5, true)));
        planetas.get(0).getLunas().add(new Luna("Luis", 3));
        planetas.get(0).getLunas().add(new Luna("Marlin", 2));
        //2
        planetas.add(new Planeta("Saturno", 5000000, 40000,60,new Gaseoso(14000, 2)));
        planetas.get(1).getLunas().add(new Luna("Papu",5));
        //3
        planetas.add(new Planeta("Marte", 52738138, 50000, 30, new Rocoso(15000, false)));
        planetas.get(2).getLunas().add(new Luna("Toño", 6));
        planetas.get(2).getLunas().add(new Luna("Emi", 3));
        
        //Cohetes por defecto
        //1
        cohetes.add(new Liquido(4000,1000,"Starlight", 1324, 500993));
        cohetes.get(0).getPersonas().add(new Persona("Luis", 30, 60));
        cohetes.get(0).getPersonas().add(new Persona("Carlos", 25, 70));
        
        //2
        cohetes.add(new Fase(5,7,20,2000,"Bonar",6215,23712));
        cohetes.get(1).getPersonas().add(new Persona("Juan", 45, 75));
        
        //3
        cohetes.add(new Solido(5000, "Hierro", 3000, "Cheto",123323, 249242));
        cohetes.get(2).getPersonas().add(new Persona("Emiliano", 35, 80));
        cohetes.get(2).getPersonas().add(new Persona("Antonio", 23, 67));
        
    }
}
