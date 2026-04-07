// Configurado con MCP por Alejandro

#include <iostream>

// Estructura para el nodo de la lista
struct Nodo {
    int dato;
    Nodo* siguiente;
};

// Clase básica para la Lista Enlazada
class ListaEnlazada {
private:
    Nodo* cabeza;

public:
    ListaEnlazada() : cabeza(nullptr) {}

    // Insertar al inicio
    void insertar(int valor) {
        Nodo* nuevoNodo = new Nodo();
        nuevoNodo->dato = valor;
        nuevoNodo->siguiente = cabeza;
        cabeza = nuevoNodo;
    }

    // Mostrar la lista
    void mostrar() {
        Nodo* temporal = cabeza;
        while (temporal != nullptr) {
            std::cout << temporal->dato << " -> ";
            temporal = temporal->siguiente;
        }
        std::cout << "NULL" << std::endl;
    }
};

int main() {
    ListaEnlazada lista;
    lista.insertar(30);
    lista.insertar(20);
    lista.insertar(10);

    std::cout << "Lista Enlazada: ";
    lista.mostrar();

    return 0;
}
