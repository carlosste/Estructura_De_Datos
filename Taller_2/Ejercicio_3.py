import time

numeros = 100000

lista = []
start_time = time.time()
for i in range(numeros):
    lista.append(i)

tiempo_lista = time.time() - start_time

diccionario = {}
start_time = time.time()
for i in range(numeros):
    diccionario[i] = i
tiempo_diccionario = time.time() - start_time

print("-----------------------")
print("Ingeniería de Sistemas")
print("Carlos Steven Lozano Quintero")
print("23/02/25")
print("-----------------------")


print(f"tiempo de creación de la lista {tiempo_lista:.6f}")
print(f"tiempo de creación del diccionario {tiempo_diccionario:.6f}")
print("-----------------------")