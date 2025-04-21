package Parcial_M2;

public class PrioridadSoporteTecnico {
    
    private String nombreSolicitud;
    private String prioridad;
    public PrioridadSoporteTecnico siguiente;

    public PrioridadSoporteTecnico(String solicitud, String prioridad){
        this.nombreSolicitud = solicitud;
        this.prioridad = prioridad;
    }

    public String getSolicitud() {
        return nombreSolicitud;
    }
    
    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad){
        this.prioridad = prioridad.toLowerCase();
    }
  
}