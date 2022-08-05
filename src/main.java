
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
                    String nombre = leer.nextLine();
                    System.out.print("Numero de serie: ");
                    int serie = leer.nextInt();
                    if(cohetes.isEmpty()== false){
                        boolean val = true;
                        do{
                            for(int i = 0; i < cohetes.size(); i++){
                                if(cohetes.get(i).getSerie() == serie){
                                    System.out.println("Ya existe un numero de serie asi");
                                    System.out.print("Numero de serie: ");
                                    serie = leer.nextInt();
                                }else{
                                    val = false;
                                }
                            }
                        }while(val == true);
                    }
                    double peso_soportable = -1;
                    while(peso_soportable < 0){
                        System.out.print("Peso soportable: ");
                        peso_soportable = leer.nextDouble();
                    }
                    int potencia = 0;
                    while(potencia < 0 || potencia > 9){
                        System.out.print("Potencia(1-9): ");
                        potencia = leer.nextInt();
                    }
                    if(tipo == 1){
                        double litros = -1;
                        while(litros < 0){
                            System.out.print("Litros de combustible: ");
                            litros = leer.nextDouble();
                        }
                        cohetes.add(new Liquido(litros, peso_soportable, nombre, serie, potencia));
                    }else if(tipo == 2){
                        int fases = 0;
                        while(fases < 1){
                            System.out.print("Fases: ");
                            fases = leer.nextInt();
                        }
                        int motores = 0;
                        while(motores < 1){
                            System.out.print("Motores: ");
                            motores = leer.nextInt();
                        }
                        double altura = 0;
                        while(altura < 1){
                            System.out.print("Altura: ");
                            altura = leer.nextDouble();
                        }
                        cohetes.add(new Fase(fases, motores, altura, peso_soportable, nombre, serie, potencia));
                    }else{
                        double kilos = 0;
                        while(kilos < 1){
                            System.out.print("Kilos: ");
                            kilos = leer.nextDouble();
                        }
                        System.out.print("Material: ");
                        String material = leer.next();
                        cohetes.add(new Solido(kilos, material, peso_soportable, nombre, serie, potencia));
                    }
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
                    nombre = leer.nextLine();
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
                    int x = -1;
                    if(cohetes.isEmpty()){
                            System.out.println("Aun no se ha agregado Cohetes");
                    }else{
                        for (Cohete ob : cohetes) {
                            System.out.println(cohetes.indexOf(ob) + ": \n" + ob.toString());
                            System.out.println();
                        }
                        while(x < 0 || x > cohetes.size()){
                            System.out.print("Ingrese el numero del cohete a editar: ");
                            x = leer.nextInt();
                        }
                        int op1 = 0;
                        while(op1 < 1 || op1 > 3){
                            System.out.println("1. Agregar Persona"
                                    + "\n2. Eliminar Persona"
                                    + "\n3. Listar Personas");
                            System.out.print("opcion: ");
                            op1 = leer.nextInt();
                        }
                        if(op1 == 1){
                            System.out.println("Nombre: ");
                            leer = new Scanner(System.in);
                            nombre = leer.nextLine();
                            System.out.print("Edad: ");
                            int edad = leer.nextInt();
                            System.out.print("Peso: ");
                            double peso = leer.nextDouble();
                            cohetes.get(x).getPersonas().add(new Persona(nombre, edad, peso));
                        }else if(op1 == 2){
                            for(int i = 0; i < cohetes.get(x).getPersonas().size(); i++){
                                System.out.println(i + " - " + cohetes.get(x).getPersonas().get(i).toString());
                                System.out.println();
                            }
                            int p = -1;
                            while(p < 0 || p > cohetes.get(x).getPersonas().size()){
                                System.out.print("Numero de persona a eliminar: ");
                                p = leer.nextInt();
                            }
                            cohetes.get(x).getPersonas().remove(p);
                        }else{
                            for(int i = 0; i < cohetes.get(x).getPersonas().size(); i++){
                                System.out.println(i + " - " + cohetes.get(x).getPersonas().get(i).toString());
                                System.out.println();
                            }                        
                        }
                    }
                break;
                
                case 4:
                    if(planetas.isEmpty() == true){
                        System.out.println("Aun no ha agregado Planetas");
                    }else{
                        for(Planeta pla : planetas){
                            System.out.println(planetas.indexOf(op) + ": \n" + pla.toString());
                            System.out.println();
                        }
                        x = -1;
                        while(x < 0 || x > planetas.size()){
                            System.out.print("Numero de planeta a modificar: ");
                            x = leer.nextInt();
                        }
                        int op2 = 0;
                        while(op2 < 1 || op2 > 3){
                            System.out.println("1. Agregar Luna"
                                    + "\n2. Eliminar Luna"
                                    + "\n3. Listar Lunas");
                            System.out.print("Opcion: "); 
                            op2 = leer.nextInt();
                        }
                        if(op2 == 1){
                            System.out.print("Nombre: ");
                            leer = new Scanner(System.in);
                            nombre = leer.nextLine();
                            int crateres = -1;
                            while(crateres < 0){
                                System.out.print("Cantidad de crateres: ");
                                crateres = leer.nextInt();
                            }
                            planetas.get(x).getLunas().add(new Luna(nombre, crateres));
                        }else if(op2 == 2){
                            for(int i = 0; i < planetas.get(x).getLunas().size(); i++){
                                System.out.println(i + " - " + planetas.get(x).getLunas().get(i).toString());
                                System.out.println();
                            }
                            int l = -1;
                            while(l < 0 || l > planetas.get(x).getLunas().size()){
                                System.out.print("Numero de lunas a eliminar: ");
                                l = leer.nextInt();
                            }
                            planetas.get(x).getLunas().remove(l);
                        }else{
                            for(int i = 0; i < planetas.get(x).getLunas().size(); i++){
                                System.out.println(i + " - " + planetas.get(x).getLunas().get(i).toString());
                                System.out.println();
                            }                        
                        }
                    }
                break;
                
                case 5:
                    for (Cohete ob : cohetes) {
                        System.out.println(cohetes.indexOf(ob) + ": \n" + ob.toString());
                        System.out.println();
                    }
                break;
                
                case 6:
                    for(Planeta pla : planetas){
                        System.out.println(planetas.indexOf(op) + ": \n" + pla.toString());
                        System.out.println();
                    }
                    
                break;
                
                case 7:
                    int fallidos = 0;
                    int exitosos = 0;
                    for(Planeta pla : planetas){
                        System.out.println(planetas.indexOf(op) + ": \n" + pla.toString());
                        System.out.println();
                    }
                    System.out.print("Seleccione el planeta: ");
                    x = leer.nextInt();
                    while(x < 0 || x > planetas.size()){
                        System.out.print("Seleccione el planeta: ");
                        x = leer.nextInt();
                    }
                    int o = 0;
                    while(o < 1 || o > 2){
                        System.out.println("1. Probar Uno"
                                + "\n2. Probar Todos");
                        System.out.print("Opcion: ");
                        o = leer.nextInt();
                    }
                    if(o == 1){
                        for (Cohete ob : cohetes) {
                            System.out.println(cohetes.indexOf(ob) + ": \n" + ob.toString());
                            System.out.println();
                        }
                        int z = -1;
                        while(z < 0 || z > cohetes.size()){
                            System.out.print("Numero de Cohete: ");
                            z = leer.nextInt();
                        }
                        double vel = cohetes.get(z).getVelocidad();
                        if(vel > planetas.get(x).getVelocidad()){
                            exitosos++;
                            System.out.println("El Cohete " + cohetes.get(z).getNombre() + " alcanzo una velocidad de " + vel  + " y logro salir del planeta " + planetas.get(x).getNombre());
                        }else{
                            fallidos++;
                            System.out.println("El Cohete " + cohetes.get(z).getNombre() + " alcanzo una velocidad de " + vel  + " y NO logro salir del planeta " + planetas.get(x).getNombre());
                        }
                    }else{
                        for(int i = 0; i < cohetes.size(); i++){
                            double vel = cohetes.get(i).getVelocidad();
                            if(vel > planetas.get(x).getVelocidad()){
                                exitosos++;
                                System.out.println("El Cohete " + cohetes.get(i).getNombre() + " alcanzo una velocidad de " + vel  + " y logro salir del planeta " + planetas.get(x).getNombre());
                            }else{
                                fallidos++;
                                System.out.println("El Cohete " + cohetes.get(i).getNombre() + " alcanzo una velocidad de " + vel  + " y NO logro salir del planeta " + planetas.get(x).getNombre());
                            }      
                            System.out.println();
                        }
                    }
                    System.out.println("Intentos Existosos: " + exitosos);
                    System.out.println("Intentos Fallidos: " + fallidos);
                break;
                
                default: 
                    System.out.println("Opcion no correcta");
                break;
            }
            System.out.println();
            System.out.println();
        }
    }
    
    public static String PlaNo(String nombre){
        return nombre;
    }
}
