
diccionariop={}

for x in range(2):
    (print("ingrese numero de telefono: "))
    telefono = int(input( {x+1}))
    (print("ingrese nombre: "))
    nombre = input({x+1})

    diccionariop[nombre] = telefono

print("Lista con los nombres")
for nombre in diccionariop:
    print(nombre)

while True:

    nombre_buscar = input("Busque el numero de la persona ingresando su nombre, si de sea salir digite -salir-: ") 
    if nombre_buscar.lower() == "salir" :
        break

    if nombre_buscar in diccionariop :
        print(f"El numero de telefono de {nombre_buscar} es: {diccionariop[nombre_buscar]}")
 
    else:
        print(f"No se encontro una persona con el nombre {nombre_buscar}")
    