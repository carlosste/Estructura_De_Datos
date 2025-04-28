import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Ordenar_cultivos {

    public static void burbuja(LocalDate[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].isAfter(arr[j + 1])) {
                    LocalDate temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Base.encabezadopgm();
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Ingrese la cantidad de parcelas de cultivo: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        LocalDate[] fechasSiembra = new LocalDate[n];

        System.out.println("Ingrese las fechas de siembra de las parcelas (formato: dd/MM/yyyy): ");
        for (int i = 0; i < n; i++) {
            String fechaStr = scanner.nextLine();
            try {
                fechasSiembra[i] = LocalDate.parse(fechaStr, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Formato de fecha inválido. Intente nuevamente.");
                i--; 
            }
        }

        burbuja(fechasSiembra);

        System.out.println("Fechas de siembra de las parcelas ordenadas: ");
        for (LocalDate fecha : fechasSiembra) {
            System.out.println(fecha.format(formatter));
        }

        scanner.close();
    }
}