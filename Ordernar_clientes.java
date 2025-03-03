import java.util.Scanner;

public class Ordernar_clientes {

    public static void burbuja(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) { // Ordenar de menor a mayor
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Base.encabezadopgm();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de clientes: ");
        int n = scanner.nextInt();

        double[] ingresos = new double[n];

        System.out.println("Ingrese los niveles de ingresos de los clientes: ");
        for (int i = 0; i < n; i++) {
            ingresos[i] = scanner.nextDouble();
        }

        burbuja(ingresos);

        System.out.println("Niveles de ingresos de los clientes ordenados de menor a mayor: ");
        for (double ingreso : ingresos) {
            System.out.print(ingreso + " ");
        }

        scanner.close();
    }
}