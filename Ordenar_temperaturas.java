import java.util.Scanner;

public class Ordenar_temperaturas {

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

        System.out.println("Ingrese la cantidad de espectros de estrellas: ");
        int n = scanner.nextInt();

        double[] temperaturas = new double[n];

        System.out.println("Ingrese las temperaturas de los espectros de estrellas: ");
        for (int i = 0; i < n; i++) {
            temperaturas[i] = scanner.nextDouble();
        }

        burbuja(temperaturas);

        System.out.println("Temperaturas de los espectros de estrellas ordenadas: ");
        for (double temperatura : temperaturas) {
            System.out.print(temperatura + " ");
        }

        scanner.close();
    }
}
