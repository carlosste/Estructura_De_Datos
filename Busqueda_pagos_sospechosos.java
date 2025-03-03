import java.util.Arrays;
import java.util.Scanner;

public class Busqueda_pagos_sospechosos {
   
    public static boolean esTransaccionSospechosa(String transaccion, double limite) {
        String[] partes = transaccion.split(",");
        double monto = Double.parseDouble(partes[1]);
        return monto > limite;
    }


    public static void main(String[] args) {

        Base.encabezadopgm();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de transacciones que son posiblemente sospechosas: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        String[] transacciones = new String[n];

        System.out.println("Ingrese las transacciones (formato: cliente,transaccion): ");
        for (int i = 0; i < n; i++) {
            transacciones[i] = scanner.nextLine();
        }

        
        System.out.println("Ingrese el límite para detectar una transacción sospechosa: ");
        double limite = scanner.nextDouble();

        Arrays.sort(transacciones);

        boolean encontrado = false;
        for (String transaccion : transacciones) {
           if (esTransaccionSospechosa(transaccion, limite)) {
                    System.out.println("Transacción sospechosa encontrada para el cliente: " + transaccion);
                    encontrado = true;
                }
            
        }

        if (!encontrado) {
            System.out.println("No se encontraron transacciones sospechosas para el cliente.");
        }

        scanner.close();
    }
}

