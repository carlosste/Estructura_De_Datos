import time

lista_grande = list(range(1, 1000000))

# Medir tiempo de búsqueda lineal
inicio = time.time()
busqueda_lineal(lista_grande, 999999)
print("Tiempo Lineal:", time.time() - inicio)

# Medir tiempo de búsqueda binaria
inicio = time.time()
busqueda_binaria(lista_grande, 999999)
print("Tiempo Binario:", time.time() - inicio)
