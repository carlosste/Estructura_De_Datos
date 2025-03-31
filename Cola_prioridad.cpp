#include <iostream>
#include <queue>
#include <string>
using namespace std;

void imprimirEncabezado() {
    string nombre = "Carlos Steven Lozano Quintero";
    string campus = "Campus Cali, U. Cooperativa de Colombia";
    string repositorioGit = "https://github.com/carlosste/Estructura_De_Datos";

    time_t ahora = time(0);
    tm* tiempoLocal = localtime(&ahora);
    char fechaHora[80];
    strftime(fechaHora, sizeof(fechaHora), "%d/%m/%Y %H:%M:%S", tiempoLocal);

    cout << "+----------------------------------------" << endl;
    cout << "| 👤 Nombre: " << nombre << endl;
    cout << "| 🎓 Campus: " << campus << endl;
    cout << "| 📅 Fecha y hora: " << fechaHora << endl;
    cout << "| 📂 Repositorio Git: " << repositorioGit << endl;
    cout << "+----------------------------------------" << endl;
    cout << endl;
}
 
struct Siniestro {
    string descripcion;
    int prioridad;
    bool operator<(const Siniestro& otro) const {
        return prioridad < otro.prioridad;
    }
};
 
int main() {
    imprimirEncabezado();
    priority_queue<Siniestro> cola;
    cola.push({"Robo leve", 1});
    cola.push({"Incendio", 3});
    cola.push({"Accidente vial", 2});
 
    while (!cola.empty()) {
        cout << "Procesando: " << cola.top().descripcion << endl;
        cola.pop();
    }
    return 0;
}
