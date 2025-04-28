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
int evaluarPostfija(string expr) {
    stack<int> pila;
    for (char c : expr) {
        if (isdigit(c)) {
            pila.push(c - '0');
        } else {
            int b = pila.top(); pila.pop();
            int a = pila.top(); pila.pop();
            if (c == '+') pila.push(a + b);
            else if (c == '-') pila.push(a - b);
            else if (c == '*') pila.push(a * b);
            else if (c == '/') pila.push(a / b);
        }
    }
    return pila.top();
}
 
int main() {
    imprimirEncabezado();
    cout << evaluarPostfija("23+5*") << endl; // Output: 25
    return 0;
}
