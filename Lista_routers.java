

import java.util.Scanner;

public class Lista_routers {

    
  



    public static void main(String[] args) {
        
        Base.encabezadopgm();


        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de la Lista de routers ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] Lista = new String[n];

        System.out.println("Ingrese la direccion de cada nodo: ");
        for (int i = 0; i < n; i++) {
            Lista[i] = scanner.nextLine();
        }

        System.out.println("El primer nodo a probar: " + Base.obtenerPrimerElemento(Lista));

        scanner.close();

    }
    
}