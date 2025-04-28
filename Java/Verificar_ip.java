import java.util.Scanner;

public class Verificar_ip {
     public static void main(String[] args) {
        Base.encabezadopgm();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de IP: ");
        int numeroIP = scanner.nextInt();

        if (Base.esPar(numeroIP)) {
            System.out.println("El número de IP es par. Asignación: Red A.");
        } else {
            System.out.println("El número de IP es impar. Asignación: Red B.");
        }

        scanner.close();
    }

    
}
