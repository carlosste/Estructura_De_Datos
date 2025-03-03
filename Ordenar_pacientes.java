import java.util.Scanner;



public class Ordenar_pacientes {

    

    public static void main(String[] args) {

        Base.encabezadopgm();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de pacientes: ");
        int n = scanner.nextInt();

        int[] prioridades = new int[n];

        System.out.println("Ingrese las prioridades de los pacientes (menor número indica mayor prioridad): ");
        for (int i = 0; i < n; i++) {
            prioridades[i] = scanner.nextInt();
        }

        Base.burbuja(prioridades);

        System.out.println("Prioridades de los pacientes ordenadas: ");
        for (int prioridad : prioridades) {
            System.out.print(prioridad + " ");
        }

        scanner.close();
    }

}