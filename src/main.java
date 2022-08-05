
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    
    static ArrayList<Planeta> planetas = new ArrayList<>();
    static ArrayList<Cohete> cohetes = new ArrayList<>();
    static Scanner leer = new Scanner(System.in);
    
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
        
        System.out.println("3 Cohetes y Planetas agregados por defecto con Lunas y Personas");
        System.out.println();
        
        boolean salida = true;
        while(salida == true){
            System.out.println("0. Salir"
                    + "\n1. Crear Cohete"
                    + "\n2. Crear Planeta"
                    + "\n3. Editar Cohete"
                    + "\n4. Editar Planeta"
                    + "\n5. Listar Cohete"
                    + "\n6. Listar Planetas"
                    + "\n7. Probar Cohete");
            System.out.print("Opcion: ");
            int op = leer.nextInt();
            switch(op){
                case 0:
                    salida = false;
                break;
                        
                case 1: 
                    int tipo = 0;
                    while(tipo < 1 || tipo > 3){
                        System.out.println("\n1. Cohete Combustible Liquido"
                                + "\n2. Cohete de Fase"
                                + "\n3. Cohete Combustible Solido");
                        tipo = leer.nextInt();
                    }
                    System.out.print("Nombre: ");
                    leer = new Scanner(System.in);
                    
                break;
                
                case 2:
                    int tip = 0;
                    System.out.println("\nTipo Planeta");
                    while(tip < 1 || tip > 2){
                        System.out.println("1. Rocoso"
                                + "2. Gaseoso");
                        System.out.print("Inserte: ");
                        tip = leer.nextInt();
                    }
                    System.out.print("Nombre: ");
                    leer = new Scanner(System.in);
                    String nombre = leer.nextLine();
                    boolean val = true;
                    do{
                        if(planetas.isEmpty() == false){
                            for(int i = 0; i < planetas.size(); i++){
                                if(planetas.get(i).getNombre().equalsIgnoreCase(nombre)){
                                    System.out.println("Ya existe un planeta con ese nombre");
                                    System.out.print("Nombre del planeta: ");
                                    leer = new Scanner(System.in);
                                    nombre = leer.nextLine();
                                }else{
                                    val = false;
                                }
                            }
                        }else{
                            val = false;
                        }
                    }while(val == true);
                    double masa = 0;
                    while(masa < 1){
                        System.out.print("Masa: ");
                        masa = leer.nextDouble();
                    }
                    double radio = 0;
                    while(radio < 1){
                        System.out.println("Radio del planeta: ");
                        radio = leer.nextDouble();
                    }
                    System.out.print("Temperatura: ");
                    double temperatura = leer.nextDouble();
                    if(tip == 1){
                        double densidad = 0;
                        while(densidad < 1){
                            System.out.print("Densidad: ");
                            densidad = leer.nextDouble();
                        }
                        int o = 0;
                        while(o < 1 || o > 2){
                            System.out.println("\n¿Hay vida?"
                                    + "\n1. si"
                                    + "\n2. no");
                            System.out.print("Opcion: ");
                            o = leer.nextInt();
                        }
                        
                        if(o == 1){
                            planetas.add(new Planeta(nombre, masa, radio, temperatura, new Rocoso(densidad,true)));
                        }else{
                            planetas.add(new Planeta(nombre, masa, radio, temperatura, new Rocoso(densidad,false)));
                        }
                    }else{
                        double presion = 0;
                        while(presion < 0){
                            System.out.print("Presion: ");
                            presion = leer.nextDouble();
                        }
                        int anillos = 0;
                        while(anillos < 0){
                            System.out.print("Cantidad de anillos: ");
                            anillos = leer.nextInt();
                        }
                        planetas.add(new Planeta(nombre, masa, radio, temperatura, new Gaseoso(presion, anillos)));
                    }
                break;
                
                case 3:
                break;
                
                case 4:
                break;
                
                case 5:
                break;
                
                case 6:
                break;
                
                case 7:
                break;
            }
        }
    }
    
    public static String PlaNo(String nombre){
        return nombre;
    }
}
