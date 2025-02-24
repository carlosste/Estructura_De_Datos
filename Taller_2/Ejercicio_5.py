import time
import random

def lineal(lista, objetivo):
    for i, valor in enumerate(lista):
        if valor == objetivo:
            return i
    return -1

def binaria(lista, objetivo):

    inicio, final = 0, len(lista) - 1
    
    while inicio <= final:
        medio = (inicio+ final) // 2
        if lista[medio] == objetivo:
            return medio
       
        elif lista[medio] < objetivo:
              inicio = medio + 1

        else:
              final = medio - 1
    return -1



tamaño_lista = [10, 100, 1000, 10000, 100000, 1000000]

resultado= []

print("-----------------------")
print("Ingeniería de Sistemas")
print("Carlos Steven Lozano Quintero")
print("23/02/25")
print("-----------------------")

for tamaño in tamaño_lista:
    lista = sorted(random.sample(range(tamaño * 10), tamaño))
    objetivo = lista[-1]


    start_time = time.time()
    lineal(lista, objetivo)
    tiempo_lineal = time.time() - start_time

    start_time = time.time()
    binaria(lista, objetivo)
    tiempo_binario = time.time() - start_time

    resultado.append((tamaño, tiempo_lineal, tiempo_binario))

    print(f"Tamaño de la lista: {tamaño}")
    print(f"Tiempo de busqueda lineal: {tiempo_lineal:.6f}")
    print(f"Tiempo de busqueda binaria: {tiempo_binario:.6f}")
    print("-----------------------")