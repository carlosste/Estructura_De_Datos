import java.util.Scanner;

public class Consumo_ancho_banda {




    
    public static void main(String[] args) {
        
        Base.encabezadopgm();
        int num_anchobanda = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero de usuarios en la torre de señal: ");
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la cantidad de consumo de ancho de banda de cada usuario " + (i+1) + ": ");
            num_anchobanda += scanner.nextInt();
        }
    
        System.out.println("El total de consumo de ancho de banda de los usuarios es: " + num_anchobanda);

        scanner.close();
    
    }
}


