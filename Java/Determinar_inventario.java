import java.util.Scanner;

public class Determinar_inventario {
    
    public static void main(String[] args) {

        Base.encabezadopgm();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de la pieza de equipo: ");
        int numeroPieza = scanner.nextInt();

        if (Base.esPar(numeroPieza)) {
            System.out.println("El número de la pieza de equipo es par. Clasificación: Sección A1.");
        } else {
            System.out.println("El número de la pieza de equipo es impar. Clasificación: Sección B1.");
        }

        scanner.close();
    }
}