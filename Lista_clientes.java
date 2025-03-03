public class Lista_clientes {


    public static void main(String[] args) {

        Base.encabezadopgm();

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        
        System.out.println("Ingrese el tamaño de la Lista de clientes que realizaron una transacción:  ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] Lista = new String[n];


        System.out.println("Ingrese los nombres de los clientes que realizaron una transacción en el dia: ");
        for (int i = 0; i < n; i++) {
            Lista[i] = scanner.nextLine();

        }
        System.out.println("El primer cliente de la lista es: " + Base.obtenerPrimerElemento(Lista));
        scanner.close();
    }
}
