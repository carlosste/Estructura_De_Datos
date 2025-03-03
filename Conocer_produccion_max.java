import java.util.Scanner;

public class Conocer_produccion_max {
    public static void main(String[] args) {

        Base.encabezadopgm();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de registros de producción diaria: ");
        int n = scanner.nextInt();

        double[] producciones = new double[n];

        System.out.println("Ingrese las producciones diarias de leche: ");
        for (int i = 0; i < n; i++) {
            producciones[i] = scanner.nextDouble();
        }

        double maxProduccion = Base.maximo(producciones);
        System.out.println("La mayor producción diaria de leche registrada es: " + maxProduccion);

        scanner.close();
    }
}
