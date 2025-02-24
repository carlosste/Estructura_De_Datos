import random
import time 
import matplotlib.pyplot as plt


def bubble_sort(n_lista):
    n = len(n_lista)
    
    for i in range(n):
        for j in range(0, n-i-1):

            if n_lista[j] > n_lista[j + 1]:
                n_lista[j], n_lista[j + 1] = n_lista[j + 1], n_lista[j]
                
    return n_lista

def merge_sort(n_lista):
    if len(n_lista) <= 1:
        return n_lista
    mid = len(n_lista) // 2
    left = merge_sort(n_lista[:mid])
    right = merge_sort(n_lista[mid:])
    return merge(left, right)

def merge(left, right):
    resultado =[]
    x = j = 0
    while x < len(left) and j < len(right):
        if left[x] < right[j]:
            resultado.append(left[x])
            x += 1
        else :
            resultado.append(right[j])
            j += 1
    resultado.extend(left[x:])
    resultado.extend(right[:j])
    return resultado

tamaño_lista = [1000, 2000, 5000, 10000]




bubble_tiempo = []
merge_tiempo = []
print("-----------------------")
print("Ingeniería de Sistemas")
print("Carlos Steven Lozano Quintero")
print("23/02/25")
print("-----------------------")


for size in tamaño_lista: 
    random_list = [random.randint(0, size) for _ in range(size)]

    start_time = time.time()
    bubble_sort(random_list.copy())
    bubble_tiempo.append(time.time() - start_time)



    start_time = time.time()
    merge_sort(random_list.copy())
    merge_tiempo.append(time.time() - start_time)


    print(f"\nTamaño de la lista: {size}")
    print(f"Bubble Sort: {bubble_tiempo} segundos")
    print(f"Merge Sort: {merge_tiempo} segundos")

