import java.util.Scanner;

public class Cantidad_depositos {

    public static void main(String[] args) {
        
        Base.encabezadopgm();

        int num_depositos = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de depositos realizados en el dia: ");
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la cantidad de cada deposito: " + (i+1) + ": ");
            num_depositos += scanner.nextInt();
        }
    
        System.out.println("la cantidad total de los depositos es: " + num_depositos);

        scanner.close();
    
    }
}
