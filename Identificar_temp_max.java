import java.util.Scanner;

public class Identificar_temp_max {
    
    public static void main(String[] args) {

        Base.encabezadopgm();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de registros de temperatura: ");
        int n = scanner.nextInt();

        double[] temperaturas = new double[n];

        System.out.println("Ingrese las temperaturas registradas en la superficie de la Luna: ");
        for (int i = 0; i < n; i++) {
            temperaturas[i] = scanner.nextDouble();
        }

        double maxTemp = Base.maximo(temperaturas);
        System.out.println("La mayor temperatura registrada en la superficie de la Luna es: " + maxTemp);

        scanner.close();
    }
}