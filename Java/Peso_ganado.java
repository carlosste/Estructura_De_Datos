import java.util.Scanner;

public class Peso_ganado {

    public static void main(String[] args) {
        
        Base.encabezadopgm();

        int num_peso = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de ganado: ");
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el peso de cada ganado: " + (i+1) + ": ");
            num_peso += scanner.nextInt();
        }
    
        System.out.println("El total de peso del ganado es: " + num_peso);

        scanner.close();
    
    }
    
}
