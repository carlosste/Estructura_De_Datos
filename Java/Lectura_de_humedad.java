

import java.util.Scanner;

public class Lectura_de_humedad {

    public static void main(String[] args) {
        
        Base.encabezadopgm();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de la Lista de lecturas de humedad realizadas:  ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] Lista = new String[n];

        System.out.println("Ingrese las lecturas de humedad realizadas: ");
        for (int i = 0; i < n; i++) {
            Lista[i] = scanner.nextLine();
        }

        System.out.println("La primera lectura de humedad a realizar es: " + Base.obtenerPrimerElemento(Lista));

        scanner.close();

    }
    
}