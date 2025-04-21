#include <iostream>
#include <fstream>
#include <stack>
#include <string>
#include <sstream>
#include <ctime>
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

struct RegistroHora {
    string hora;
    int consumo;
};

int main(){
    imprimirEncabezado();
        ifstream archivo("Consumo.txt");
    if (!archivo.is_open()){
            cerr <<"Error al abrir el archivo.\n";
        return 1;
    }

        stack<RegistroHora> pila;
        string linea;

    while (getline (archivo, linea)){
        istringstream iss(linea);
        RegistroHora r; 
        iss>> r.hora >> r.consumo;
        pila.push(r);
    }

    archivo.close();

    cout << "Registros de consumo en orden inverso:\n";
    while (!pila.empty()){
        RegistroHora r = pila.top();
        cout << r.hora << " - " << r.consumo << " Kw";
        if (r.consumo > 1200){
            cout << " Alerta: Hay pico de consumo";

        }
        cout << endl;
        pila.pop();
    }
    return 0;
}