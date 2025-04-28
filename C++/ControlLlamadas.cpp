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
 
void factorial(int n) {
    stack<int> pila;
    int resultado = 1;
    for (int i = n; i > 1; i--) {
        pila.push(i);
    }
    while (!pila.empty()) {
        resultado *= pila.top();
        pila.pop();
    }
    cout << "Factorial: " << resultado << endl;
}
 
int main() {
    imprimirEncabezado();

    factorial(5); // Output: 120
    return 0;
}
