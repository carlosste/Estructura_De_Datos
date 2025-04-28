
import java.util.Arrays;
import java.util.Scanner;
    
public class Busqueda_img_satelital {
    
    
    
    public static void main(String[] args) {

            Base.encabezadopgm();
            Scanner scanner = new Scanner(System.in);
    
            int n = 100;
            String[] imagenes = new String[n];
    
            for (int i = 0; i < n; i++) {
                imagenes[i] = "img" + (i + 1);
            }
    
            Arrays.sort(imagenes);
    
            System.out.println("Ingrese el identificador de la imagen que desea buscar: ");
            String target = scanner.nextLine();
    
            int resultado = Base.busquedaBinaria(imagenes, target);
            if (resultado != -1) {
                System.out.println("Imagen encontrada en la posición: " + resultado);
            } else {
                System.out.println("Imagen no encontrada.");
        }
    
        scanner.close();
    }
}

