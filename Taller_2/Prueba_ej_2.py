import time

#def recursivo(n) :
#    if n == 0 or n == 1:
#return 1
#   return n * recursivo(n-1)
#("Factorial de 5 con el metodo recursivo")
# print(recursivo(5))
# print("-----------------------")


index = {}

def dinamico(n):
    if n in index:
        return index[n]
    if n == 0 or n == 1:
        index[n] = 1
    else:
        index[n] = n * dinamico(n-1)

    return index[n]
print("-----------------------")
print("Factorial de 5 con el metodo dinamico")
print(dinamico(5))

valores = [10, 20, 50, 500, 1000, 1500]

print("-----------------------")
print("Ingeniería de Sistemas")
print("Carlos Steven Lozano Quintero")
print("23/02/25")
print("-----------------------")
print("Tiempos de ejecución")

for n in valores:


    # start_time = time.time()
    # recursivo(n)
    # tiempo_recursivo = time.time() - start_time


    start_time = time.time()
    dinamico(n)
    tiempo_dinamico = time.time() - start_time

    print(f"Factorial de {n}")
    # print(f"Recursivo: {tiempo_recursivo:.6f}")
    print(f"Dinamico: {tiempo_dinamico:.6f}")
    print("-----------------------")
