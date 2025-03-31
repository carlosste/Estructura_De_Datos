#include <iostream>
#include <queue>
#include <mutex>
#include <thread>
using namespace std;
 
queue<string> alertas;
mutex mtx;

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

void generarAlertas() {
    string eventos[] = {"Temperatura alta", "Aceite bajo", "Nivel de agua crítico"};
    for (string alerta : eventos) {
        this_thread::sleep_for(chrono::milliseconds(400));
        lock_guard<mutex> lock(mtx);
        alertas.push(alerta);
    }
}
 
void atenderAlertas() {
    for (int i = 0; i < 3; ++i) {
        this_thread::sleep_for(chrono::milliseconds(600));
        lock_guard<mutex> lock(mtx);
        if (!alertas.empty()) {
            cout << "Atendiendo: " << alertas.front() << endl;
            alertas.pop();
        }
    }
}
 
int main() {
    imprimirEncabezado();
    thread sensores(generarAlertas);
    thread tecnicos(atenderAlertas);
    sensores.join();
    tecnicos.join();
    return 0;
}
