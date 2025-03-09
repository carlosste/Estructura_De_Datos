

import java.time.LocalDate;

public class SolicitudMantenimiento {
    private String id;
    private String equipo;
    private String prioridad; // "alta", "media", "baja" "critica"
    private LocalDate fechaLimite;
    public SolicitudMantenimiento siguiente;
 
    public SolicitudMantenimiento(String id, String equipo, String prioridad, LocalDate fechaLimite) {
        this.id = id;
        this.equipo = equipo;
        this.prioridad = prioridad.toLowerCase();
        this.fechaLimite = fechaLimite;
        this.siguiente = null;
    }
 
    public String getId() {
        return id;
    }
 
    public String getEquipo() {
        return equipo;
    }
 
    public String getPrioridad() {
        return prioridad;
    }
   
    public LocalDate getFechaLimite() {
        return fechaLimite;
    }
    
    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad.toLowerCase();
    }
}

