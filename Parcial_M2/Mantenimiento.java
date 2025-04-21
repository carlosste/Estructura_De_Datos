package Parcial_M2;


public class Mantenimiento {

    private PrioridadSoporteTecnico cabeza;

    public Mantenimiento() {
        this.cabeza = null;
    }

    public void agregarSolicitud(String solicitud, String prioridad){

        PrioridadSoporteTecnico nueva = new PrioridadSoporteTecnico(solicitud, prioridad);

        if (cabeza == null || prioridadEsMayor(nueva, cabeza)){
            nueva.siguiente = cabeza;
            cabeza = nueva;
        } else {
            PrioridadSoporteTecnico temp = cabeza;
            while (temp.siguiente != null && !prioridadEsMayor(nueva,temp.siguiente)){
            temp = temp.siguiente;
            }
            nueva.siguiente = temp.siguiente;
            temp.siguiente = nueva;
        }
    }
    
    public PrioridadSoporteTecnico procesarSolicitud(){
        if (cabeza == null){
            return null;
        }
        PrioridadSoporteTecnico procesada = cabeza;
        cabeza = cabeza.siguiente;
        return procesada;
    }

    public void mostrarSolicitudes(){
        PrioridadSoporteTecnico temp = cabeza;
        while (temp != null){
            System.out.println("Solicitud: " + temp.getSolicitud() + ", Prioridad: " + temp.getPrioridad());
            temp = temp.siguiente; 
        }
    }

    private boolean prioridadEsMayor(PrioridadSoporteTecnico nueva, PrioridadSoporteTecnico actual){

      String[] niveles = {"alta", "media", "baja"};
      int prioridadNueva = java.util.Arrays.asList(niveles).indexOf(nueva.getPrioridad());
    int prioridadActual = java.util.Arrays.asList(niveles).indexOf(actual.getPrioridad());
    return prioridadNueva < prioridadActual;    
    }  

}


