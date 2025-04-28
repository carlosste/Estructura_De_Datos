
import java.util.Scanner;

public class Temperatura_registradas {

    public static void main(String[] args) {
        
        Base.encabezadopgm();


        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero de temperaturas registradradas:  ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] Lista = new String[n];

        System.out.println("Ingrese las temperaturas registradas: ");
        for (int i = 0; i < n; i++) {
            Lista[i] = scanner.nextLine();
        }

        System.out.println("La primera temperatura realizada es: " + Base.obtenerPrimerElemento(Lista));

        scanner.close();

    }
    
}