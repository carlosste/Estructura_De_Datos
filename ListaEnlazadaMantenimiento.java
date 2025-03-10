
import java.time.LocalDate;


public class ListaEnlazadaMantenimiento {
    private SolicitudMantenimiento cabeza;
 
    public ListaEnlazadaMantenimiento() {
        this.cabeza = null;
    }
 
    // Método para agregar una solicitud según su prioridad
    public void agregarSolicitud(String id, String equipo, String prioridad, LocalDate fechaLimite) {

        SolicitudMantenimiento nueva = new SolicitudMantenimiento(id, equipo, prioridad, fechaLimite);
        
        actualizarPrioCritica(nueva);
 
        if (cabeza == null || prioridadEsMayor(nueva, cabeza)) {
            nueva.siguiente = cabeza;
            cabeza = nueva;
        } else {
            SolicitudMantenimiento temp = cabeza;
            while (temp.siguiente != null && !prioridadEsMayor(nueva, temp.siguiente)) {
                temp = temp.siguiente;
            }
            nueva.siguiente = temp.siguiente;
            temp.siguiente = nueva;
        }
    }
 
    // Método para procesar la solicitud de mayor prioridad
    public SolicitudMantenimiento procesarSolicitud() {
        if (cabeza == null) {
            return null;
        }
        SolicitudMantenimiento procesada = cabeza;
        cabeza = cabeza.siguiente;
        return procesada;
    }

    // Mostrar todas las solicitudes pendientes
    public void mostrarSolicitudes() {
        SolicitudMantenimiento temp = cabeza;
        while (temp != null) {
            System.out.println("ID: " + temp.getId() + ", Equipo: " + temp.getEquipo() + ", Prioridad: " + temp.getPrioridad() + ", Fecha límite: " + temp.getFechaLimite());
            temp = temp.siguiente;
        }
    }
 
    // Evaluar si la prioridad de una solicitud es mayor a otra
    private boolean prioridadEsMayor(SolicitudMantenimiento nueva, SolicitudMantenimiento actual) {
        String[] niveles = {"alta", "media", "baja"};
        int prioridadNueva = java.util.Arrays.asList(niveles).indexOf(nueva.getPrioridad());
        int prioridadActual = java.util.Arrays.asList(niveles).indexOf(actual.getPrioridad());
        return prioridadNueva < prioridadActual;
    }

    private void actualizarPrioCritica(SolicitudMantenimiento solicitud){
        LocalDate hoy = LocalDate.now();
        if (solicitud.getFechaLimite().minusDays(2).isBefore(hoy) || solicitud.getFechaLimite().isEqual(hoy)){
            solicitud.setPrioridad("critica");
        }
    }
}

