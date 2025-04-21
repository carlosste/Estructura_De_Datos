package Parcial_M2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EjecutableSoporteT {
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

    
    public static void main(String[] args){

        encabezadopgm();

        Mantenimiento lista = new Mantenimiento();

        lista.agregarSolicitud("Servicio de limpieza", "baja");
        lista.agregarSolicitud("Reparación de aire acondicionado", "media");
        lista.agregarSolicitud("Instalación de software", "alta");
        lista.agregarSolicitud("Revisión de seguridad", "alta");


        System.out.println("Solicitudes pendientes:");
        lista.mostrarSolicitudes();

        PrioridadSoporteTecnico procesada = lista.procesarSolicitud();
        System.out.println("\nSolicitud procesada: " + procesada.getSolicitud());

        System.out.println("\nSolicitudes pendientes:");
        lista.mostrarSolicitudes();
    }
}