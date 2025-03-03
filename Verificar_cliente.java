import java.util.Scanner;

public class Verificar_cliente {
     public static void main(String[] args) {

        Base.encabezadopgm();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de cuenta del cliente: ");
        int num = scanner.nextInt();

        if (Base.esPar(num)) {
            System.out.println("El número de cuenta del cliente es par. Tipo de cuenta: Cuenta de ahorros");
        } else {
            System.out.println("El número de cuenta del cliente es impar. Tipo de cuenta: Cuenta corriente.");
        }

        scanner.close();
    }
}
