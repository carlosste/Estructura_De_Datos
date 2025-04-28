import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Separar_lotes{
public static void main(String[] args) {
    Base.encabezadopgm();
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese la cantidad de lotes de pollos: ");
    int n = scanner.nextInt();
    int[] lotes = new int[n];

    System.out.println("Ingrese la cantidad de los pollos de cada lote:");
    for (int i = 0; i < n; i++) {
        lotes[i] = scanner.nextInt();
    }

    List<Integer> lotesPares = new ArrayList<>();
    List<Integer> lotesImpares = new ArrayList<>();

    for (int lote : lotes) {
        if (lote % 2 == 0) {
            lotesPares.add(lote);
        } else {
            lotesImpares.add(lote);
        }
    }

    System.out.println("Lotes de pollos pares: " + lotesPares);
    System.out.println("Lotes de pollos impares: " + lotesImpares);

    scanner.close();
}
}