import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Transaccion {

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

    private String id;
    private double monto;
    private String tipo;
    public Transaccion siguiente;


    public Transaccion(String id, double monto, String tipo) {
        this.id = id;
        this.monto = monto;
        this.tipo = tipo;
        this.siguiente = null;
    }

    public String getId() {
        return id;
    }

    public double getMonto() {
        return monto;
    }

    public String getTipo() {
        return tipo;
    }
    
    public static class ListaEnlazadaTransaccion{

        private Transaccion cabeza;
    
        public ListaEnlazadaTransaccion(){
            this.cabeza = null;
        }
    
        public void agregarTransaccion(String id, double monto, String tipo){
            Transaccion nuevaTransaccion = new Transaccion(id, monto, tipo);
            if(cabeza == null){
                cabeza = nuevaTransaccion;
           
            }  else {
                Transaccion temp = cabeza;
                while(temp.siguiente != null){
                    temp = temp.siguiente;
                }
                temp.siguiente = nuevaTransaccion;
            }
        }
    
        public Transaccion procesarTransaccion(){
            if (cabeza == null){
                return null;
            }
            Transaccion procesada = cabeza;
            cabeza = cabeza.siguiente;
            return procesada;
        }
        public void mostrarTransaccion(){
            Transaccion temp = cabeza;
            while (temp != null) {
                System.out.println("ID: " + temp.getId() + "Monto: " + temp.getMonto() + " Tipo: " + temp.getTipo());
                temp = temp.siguiente;
            }
        }
       
    }
    
   



    public static void main(String[] args) {

        ListaEnlazadaTransaccion lista = new ListaEnlazadaTransaccion();

        lista.agregarTransaccion("P001 ", 500.0 , "Deposito");
        lista.agregarTransaccion("P002 ", 100.0 , "Retiro");
        lista.agregarTransaccion("P003 ", 200.0 , "Deposito");

        encabezadopgm();
        System.out.println("Transacciones pendientes: ");
        lista.mostrarTransaccion();

        Transaccion procesada = lista.procesarTransaccion();
        System.out.println("Transaccion procesada: " + procesada.getId() );
        System.out.println("Transacciones pendientes: ");
        lista.mostrarTransaccion();

    }

    

    
}

