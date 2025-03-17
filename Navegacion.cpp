#include <iostream>
#include <stack>
#include <string>
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
 
int main() {
    
    imprimirEncabezado();
    stack<string> historial;
    historial.push("www.google.com");
    historial.push("www.github.com");
    historial.push("www.stackoverflow.com");
    
    cout << "Página actual: " << historial.top() << endl;
    historial.pop();
    cout << "Retrocediendo... Ahora en: " << historial.top() << endl;
    return 0;
}
