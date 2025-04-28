import java.util.Scanner;

public class Verificar_codigo {
    
     public static void main(String[] args) {

        Base.encabezadopgm();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el código del medicamento: ");
        int codigo = scanner.nextInt();

        if (Base.esPar(codigo)) {
            System.out.println("El código del medicamento es par. Ubicación: Sección A.");
        } else {
            System.out.println("El código del medicamento es impar. Ubicación: Sección B.");
        }

        scanner.close();
    }

}
