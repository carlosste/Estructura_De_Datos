import java.util.Scanner;

public class Consumo_calorias {
    
    public static void main(String[] args) {
        
        Base.encabezadopgm();
        int num_calorias = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero de comidas consumidas en el dia: ");
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el numero de calorias consumidas en cada comida: " + (i+1) + ": ");
            num_calorias += scanner.nextInt();
        }
    
        System.out.println("El total de calorias consumidas en el dia es: " + num_calorias);

        scanner.close();
    
    }
}
