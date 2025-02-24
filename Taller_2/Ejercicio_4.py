import time

def fibonacci_re(n):
    if n == 0 or n == 1:
        return n
    return fibonacci_re(n-1) + fibonacci_re(n-2)

index= {}
def fibonacci_di(n):
    if n in index:
        return index[n]
    if n <= 1 :
        index[n] = n
        return n
    index[n] = fibonacci_di(n-1) + fibonacci_di(n-2)
    return index[n]

n=50



print("-----------------------")
print("Ingeniería de Sistemas")
print("Carlos Steven Lozano Quintero")
print("23/02/25")
print("-----------------------")

start_time = time.time()
resultado_re = fibonacci_re(n)
tiempo_recursivo = time.time() - start_time

start_time = time.time()
resultado_di = fibonacci_di(n)
tiempo_dinamico = time.time() - start_time

print("Tiempo de ejucion de diferentes metodos de fibonacci")
print(f"recursivo: {tiempo_recursivo:.6f} resultado: {resultado_re}")
print(f"dinamico: {tiempo_dinamico:.6f} resultado: {resultado_di}")
