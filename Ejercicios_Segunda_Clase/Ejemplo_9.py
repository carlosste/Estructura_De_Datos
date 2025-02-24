import time

lista_grande = list(range(1, 1000000))

def busqueda_lineal(lista, objetivo):
    for i, valor in enumerate(lista):
        if valor == objetivo:
            return i
    return -1

def busqueda_binaria(lista, objetivo):

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


# Medir tiempo de búsqueda lineal
start_time = time.time()
busqueda_lineal(lista_grande, 999999)
tiempo_lineal = time.time() - start_time
# Medir tiempo de búsqueda binaria
start_time = time.time()
busqueda_binaria(lista_grande, 999999)
tiempo_binario = time.time() - start_time

print(f"Busqueda lineal {tiempo_lineal}")
print(f"Busqueda binaria{tiempo_binario}")
