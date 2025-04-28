import java.util.Scanner;

public class Encontrar_temp_max {

     

    public static void main(String[] args) {
        Base.encabezadopgm();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de registros de temperatura del paciente: ");
        int n = scanner.nextInt();

        double[] temperaturas = new double[n];

        System.out.println("Ingrese las temperaturas registradas del paciente: ");
        for (int i = 0; i < n; i++) {
            temperaturas[i] = scanner.nextDouble();
        }

        double maxTemp = Base.maximo(temperaturas);
        System.out.println("La temperatura máxima registrada del paciente es: " + maxTemp);

        scanner.close();
    }
    
}
