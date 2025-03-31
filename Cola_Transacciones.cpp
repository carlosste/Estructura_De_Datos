#include <iostream>
#include <queue>
#include <thread>
#include <mutex>
#include <chrono>
using namespace std;
 
queue<string> transacciones;
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

void productor() {
    for (int i = 1; i <= 5; ++i) {
        this_thread::sleep_for(chrono::milliseconds(500));
        lock_guard<mutex> lock(mtx);
        string trans = "Transaccion #" + to_string(i);
        transacciones.push(trans);
        cout << "Producida: " << trans << endl;
    }
}
 
void consumidor() {
    for (int i = 1; i <= 5; ++i) {
        this_thread::sleep_for(chrono::milliseconds(800));
        lock_guard<mutex> lock(mtx);
        if (!transacciones.empty()) {
            cout << "Procesada: " << transacciones.front() << endl;
            transacciones.pop();
        }
    }
}
 
int main() {
    imprimirEncabezado();
    thread t1(productor);
    thread t2(consumidor);
    t1.join();
    t2.join();
    return 0;
}