import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class Exportar_frutas {

    public static void main(String[] args) {

        Base.encabezadopgm();
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Ingrese la cantidad de pedidos: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        String[] pedidos = new String[n];

        System.out.println("Ingrese los pedidos de los clientes (formato: cliente,fecha(dd/MM/yyyy)): ");
        for (int i = 0; i < n; i++) {
            pedidos[i] = scanner.nextLine();
        }

        Arrays.sort(pedidos);

        System.out.println("Ingrese el cliente que desea buscar: ");
        String cliente = scanner.nextLine();

        System.out.println("Ingrese la fecha de inicio del rango (dd/MM/yyyy): ");
        String fechaInicioStr = scanner.nextLine();
        LocalDate fechaInicio = LocalDate.parse(fechaInicioStr, formatter);

        System.out.println("Ingrese la fecha de fin del rango (dd/MM/yyyy): ");
        String fechaFinStr = scanner.nextLine();
        LocalDate fechaFin = LocalDate.parse(fechaFinStr, formatter);

        boolean encontrado = false;
        for (String pedido : pedidos) {
            String[] partes = pedido.split(",");
            String clientePedido = partes[0];
            LocalDate fechaPedido = LocalDate.parse(partes[1], formatter);

            if (clientePedido.equals(cliente) && (fechaPedido.isEqual(fechaInicio) || fechaPedido.isEqual(fechaFin) || (fechaPedido.isAfter(fechaInicio) && fechaPedido.isBefore(fechaFin)))) {
                System.out.println("Pedido encontrado: " + pedido);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Pedido no encontrado en el rango de fechas especificado.");
        }

        scanner.close();
    }
}