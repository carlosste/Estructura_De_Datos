contador = {}


texto = input("Ingrese la oracion para hacer recuento de las palabras usadas: ")

palabras = texto.split ()

for palabra in palabras:
    if palabra in contador:
        contador[palabra] += 1
    else:
        contador[palabra] = 1

print("Palabras contadas")
for palabra, contador in contador.items():
    print(f"{palabra} " f" {contador}")
