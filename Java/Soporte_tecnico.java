import java.util.Arrays;
import java.util.Scanner;

public class Soporte_tecnico {
    

    public static void main(String[] args) {
        Base.encabezadopgm();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de quejas: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] quejas = new String[n];

        System.out.println("Ingrese el numero de queja de los clientes: ");
        for (int i = 0; i < n; i++) {
            quejas[i] = scanner.nextLine();
        }


        Arrays.sort(quejas);

        System.out.println("Ingrese la queja que desea buscar: ");
        String target = scanner.nextLine();

        int resultado = Base.busquedaBinaria(quejas, target);
        if (resultado != -1) {
            System.out.println("Queja encontrada en la posición: " + resultado);
        } else {
            System.out.println("Queja no encontrada.");
        }

        scanner.close();



           
    }
}
