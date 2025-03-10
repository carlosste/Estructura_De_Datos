

import java.util.Scanner;

public class Lista_paciente {

    
    


   

    public static void main(String[] args) {
        
        Base.encabezadopgm();


        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de la Lista de pacientes: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] Lista = new String[n];

        System.out.println("Ingrese los nombres de los pacientes:");
        for (int i = 0; i < n; i++) {
            Lista[i] = scanner.nextLine();
        }

        System.out.println("El primer turno de la lista es: " + Base.obtenerPrimerElemento(Lista));

        scanner.close();

    }

    
    
}