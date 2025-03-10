import java.util.ArrayList;
import java.util.Scanner;

public class GestionTurnos {

    private String nombre;
    private String id;
    

    GestionTurnos(String nombre, String id){
        this.nombre = nombre;
        this.id = id;
    }


    public String getNombre(){
        return nombre;
    }
    public String getId(){
        return id;
    }

    public static String PrimerTurno(ArrayList<GestionTurnos> lista){
        
        return lista.get(0).getNombre();
    }

    public static void EliminarTurno(ArrayList<GestionTurnos> lista){
        lista.remove(0);
    }

    public static void main (String[] args){
        Base.encabezadopgm();
        
        Scanner sn = new Scanner(System.in);
        ArrayList <GestionTurnos> lista = new ArrayList<>(); 

        while (true) {
            System.out.println("Ingrese el nombre del paciente o digite 'salir' para terminar el proceso ");
            String nombre = sn.nextLine();
            if(nombre.equalsIgnoreCase("salir")){
                break;
            }
            System.out.println("Ingrese el ID del paciente");
            String id = sn.nextLine();

            GestionTurnos paciente = new GestionTurnos(nombre, id);
            lista.add(paciente);
            
        }
        
        sn.close();

        while (!lista.isEmpty()){
            System.out.println("Siguente turno: " + PrimerTurno(lista));
         EliminarTurno(lista);
            System.out.println("Pacientes restantes: " + lista.size());
        
        }
        System.out.println("Ya no hay pacientes para atender.");
    }
}
