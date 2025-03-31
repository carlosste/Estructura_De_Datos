#include <iostream>
#include <queue>
#include <mutex>
#include <thread>
using namespace std;
 
queue<string> mensajes;
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

void enviarMensajes() {
    for (int i = 0; i < 4; ++i) {
        this_thread::sleep_for(chrono::milliseconds(300));
        lock_guard<mutex> lock(mtx);
        mensajes.push("Mensaje " + to_string(i+1));
    }
}
 
void recibirMensajes() {
    for (int i = 0; i < 4; ++i) {
        this_thread::sleep_for(chrono::milliseconds(500));
        lock_guard<mutex> lock(mtx);
        if (!mensajes.empty()) {
            cout << "Recibido: " << mensajes.front() << endl;
            mensajes.pop();
        }
    }
}
 
int main() {
    imprimirEncabezado();
    thread productor(enviarMensajes);
    thread consumidor(recibirMensajes);
    productor.join();
    consumidor.join();
    return 0;
}
