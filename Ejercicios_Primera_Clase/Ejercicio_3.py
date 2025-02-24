compras=[]

def agregar_articulo():
    articulo = input("ingrese el articulo que desea agregar a la lista de compras: ")
    compras.append(articulo)
    print("El {articulo} ha sido agregado")


def lista():
    print("lista de compras")
    print(compras)


def eliminar_articulo() :
    articulo = input("seleccione el articulo que desee eliminar: ")
    if articulo in compras :
        compras.remove(articulo)
        print("{articulo} ha sido eliminado de la lista")
    else:
        print("{articulo} no esta en la lista")
    
while True:
    print("MENU DE OPCIONES")
    print("1. Agregar articulo")
    print("2. Eliminar articulo")
    print("3. Ver lista")
    print("4. Salir")

    opcion = input("Seleccione una de las opciones")
    if opcion == "1":
        agregar_articulo()
    elif opcion == "2":
        eliminar_articulo()
    elif opcion == "3":
        lista()
    elif opcion == "4":
        print("Saliendo..")
        break
    else: 
        print("opcion no valida, ingrese numero del 1 al 4 ")

