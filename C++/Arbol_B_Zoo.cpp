#include <iostream>
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


struct Especie {
    string nombre;
    Especie* izq;
    Especie* der;
};
 
Especie* nuevaEspecie(string nombre) {
    Especie* e = new Especie();
    e->nombre = nombre;
    e->izq = e->der = nullptr;
    return e;
}
 
Especie* insertar(Especie* raiz, string nombre) {
    if (raiz == nullptr) return nuevaEspecie(nombre);
    if (nombre < raiz->nombre) raiz->izq = insertar(raiz->izq, nombre);
    else raiz->der = insertar(raiz->der, nombre);
    return raiz;
}
 
void inorden(Especie* raiz) {
    if (raiz) {
        inorden(raiz->izq);
        cout << raiz->nombre << " ";
        inorden(raiz->der);
    }
}
 
int main() {
    imprimirEncabezado();
    Especie* raiz = nullptr;
    raiz = insertar(raiz, "Tigre");
    insertar(raiz, "Elefante");
    insertar(raiz, "Mono");
    insertar(raiz, "Cebra");
    insertar(raiz, "Gorila");
 
    cout << "Especies en orden alfabético: ";
    inorden(raiz);
    return 0;
}