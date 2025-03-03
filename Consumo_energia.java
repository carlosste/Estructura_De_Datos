import java.util.Scanner;

public class Consumo_energia {
            
    public static void main(String[] args) {
        
        Base.encabezadopgm();
        int num_energia = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de modulos en la estación: ");
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la cantidad de energia consumida por cada modulo " + (i+1) + ": ");
            num_energia += scanner.nextInt();
        }
    
        System.out.println("El total de energia consumida por los modulos es de: " + num_energia +"kWh");

        scanner.close();
    
    }
}
