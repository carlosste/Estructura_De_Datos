import java.util.Scanner;

public class Encontrar_velocidad_max {
    
    public static void main(String[] args) {

        Base.encabezadopgm();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de registros de velocidad: ");
        int n = scanner.nextInt();

        double[] velocidades = new double[n];

        System.out.println("Ingrese las velocidades registradas: ");
        for (int i = 0; i < n; i++) {
            velocidades[i] = scanner.nextDouble();
        }

        double maxVelocidad = Base.maximo(velocidades);
        System.out.println("La mayor velocidad de descarga registrada es: " + maxVelocidad);

        scanner.close();
    }
}
