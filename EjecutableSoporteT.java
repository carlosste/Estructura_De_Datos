public class EjecutableSoporteT {
    
    public static void main(String[] args){

        Base.encabezadopgm();

        Mantenimiento lista = new Mantenimiento();

        lista.agregarSolicitud("Servicio de limpieza", "general");
        lista.agregarSolicitud("Reparación de aire acondicionado", "importante");
        lista.agregarSolicitud("Instalación de software", "critica");
        lista.agregarSolicitud("Revisión de seguridad", "critica");


        System.out.println("Solicitudes pendientes:");
        lista.mostrarSolicitudes();

        PrioridadSoporteTecnico procesada = lista.procesarSolicitud();
        System.out.println("\nSolicitud procesada: " + procesada.getSolicitud());

        System.out.println("\nSolicitudes pendientes:");
        lista.mostrarSolicitudes();
    }
}
