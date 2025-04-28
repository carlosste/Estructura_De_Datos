import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class PruebaListaMantenimiento {
    public static void main(String[] args) {

        ListaEnlazadaMantenimiento lista = new ListaEnlazadaMantenimiento();
      
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
 
        // Agregar solicitudes de mantenimiento con diferentes prioridades
        lista.agregarSolicitud("M001", "Bomba de Agua", "media", LocalDate.parse("15/03/2025", formatter));
        lista.agregarSolicitud("M002", "Generador Principal", "alta", LocalDate.parse("10/03/2025", formatter));
        lista.agregarSolicitud("M003", "Sistema de Ventilación", "baja", LocalDate.parse("20/03/2025", formatter));
        lista.agregarSolicitud("M004", "Sensor de Gas", "alta", LocalDate.parse("12/03/2025", formatter));
 
        // Mostrar solicitudes pendientes
        System.out.println("Solicitudes pendientes:");
        lista.mostrarSolicitudes();
 
        // Procesar la solicitud más prioritaria
        SolicitudMantenimiento procesada = lista.procesarSolicitud();
        System.out.println("\nSolicitud procesada: ID: " + procesada.getId() + ", Equipo: " + procesada.getEquipo());
 
        // Mostrar solicitudes pendientes después del procesamiento
        System.out.println("\nSolicitudes pendientes:");
        lista.mostrarSolicitudes();
    }
}
