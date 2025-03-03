import java.util.Arrays;
import java.util.Scanner;

public class Busqueda_diagnostico {
    


    public static void main(String[] args) {

        Base.encabezadopgm();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de pacientes en el historial: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        String[] diagnosticos = new String[n];

        System.out.println("Ingrese los diagnósticos de los pacientes: ");
        for (int i = 0; i < n; i++) {
            diagnosticos[i] = scanner.nextLine();
        }

        Arrays.sort(diagnosticos);

        System.out.println("Ingrese el diagnóstico que desea buscar: ");
        String target = scanner.nextLine();

        int resultado = Base.busquedaBinaria(diagnosticos, target);

        if (resultado != -1) {
            System.out.println("Diagnóstico encontrado en la posición: " + resultado);
        } else {
            System.out.println("Diagnóstico no encontrado.");
        }

        scanner.close();
    }


}
