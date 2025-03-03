import java.util.Scanner;

public class Ordenar_torres {
 
    
     public static void main(String[] args) {

        Base.encabezadopgm();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de torres de señal: ");
        int n = scanner.nextInt();

        int[] intensidades = new int[n];

        System.out.println("Ingrese las intensidades de señal de las torres: ");
        for (int i = 0; i < n; i++) {
            intensidades[i] = scanner.nextInt();
        }

        Base.burbuja(intensidades);

        System.out.println("Intensidades de señal de las torres ordenadas de menor a mayor: ");
        for (int intensidad : intensidades) {
            System.out.print(intensidad + " ");
        }

        scanner.close();
    }
}
