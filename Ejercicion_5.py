diccionarioc={}

for x in range(2):
    (print("ingrese la temperatura en grados celsius "))
    temperatura = float(input())
    (print("ingrese nombre de la ciudad: "))
    nombre = input()

    diccionarioc[nombre] = temperatura

print("Lista con los nombres")
for nombre in diccionarioc:
    print(nombre)

for nombre in diccionarioc:
    celsius= diccionarioc[nombre]
    fahrenheit = (celsius* 9/5) + 32
    diccionarioc[nombre] = fahrenheit


while True:

    nombre_buscar = input("Busque los valores de temperatura usando el nombre de la ciudad, si de sea salir digite -salir-: ") 
    if nombre_buscar.lower() == "salir" :
        break

    if nombre_buscar in diccionarioc :
        print(f"la temperatura en grados fahrenheit {nombre_buscar} es: {diccionarioc[nombre_buscar]}")
 
    else:
        print(f"No se encontro ciudad con el nombre {nombre_buscar}")
    