


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Base {
    
        
    public static void encabezadopgm() {
        // Datos del encabezado
        String nombre = "Carlos Steven Lozano Quintero";
        String campus = "Campus Cali, U. Cooperativa de Colombia";
        String repositorioGit = "https://github.com/carlosste/Estructura_De_Datos";

        // Obtener la fecha y hora actual
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fechaHora = ahora.format(formateador);

        // imprimir encabezado
        System.out.println();
        System.out.println("+----------------------------------------");
        System.out.println("| 👤 Nombre: " + nombre);
        System.out.println("| 🎓 Campus: " + campus);
        System.out.println("| 📅 Fecha y hora: " + fechaHora);
        System.out.println("| 📂 Repositorio Git: " + repositorioGit);
        System.out.println("+----------------------------------------");
        System.out.println();
    }

    public static String obtenerPrimerElemento(String[] Lista) {
        return Lista[0];
    }

        
    public static int busquedaBinaria(String[] arr, String target) {
        int izquierda = 0, derecha = arr.length - 1;
        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            int comparacion = arr[medio].compareTo(target);
            if (comparacion == 0) return medio;
            if (comparacion < 0) izquierda = medio + 1;
            else derecha = medio - 1;
        }
        return -1;
    }

    public static void burbuja(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static boolean esPar(int num) {
        return num % 2 == 0;
    }

    public static double maximo(double[] arr) {
        double max = arr[0];
        for (double num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
