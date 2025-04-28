import java.util.Scanner;

public class Conocer_transaccion_max {
    
    public static void main(String[] args) {

        Base.encabezadopgm();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de transacciones en efectivo del día: ");
        int n = scanner.nextInt();

        double[] transacciones = new double[n];

        System.out.println("Ingrese los montos de las transacciones en efectivo: ");
        for (int i = 0; i < n; i++) {
            transacciones[i] = scanner.nextDouble();
        }

        double maxTransaccion = Base.maximo(transacciones);
        System.out.println("La mayor transacción en efectivo del día es: " + maxTransaccion);

        scanner.close();
    }
}
