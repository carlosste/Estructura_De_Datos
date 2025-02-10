
numeros = []




for x in range(5):
    (print("Ingrese los numeros que desea ingresar en la lista. Limite 5 " , " Solo numeros Enteros: "))
    numero = int(input( {x+1}))
    numeros.append(numero)

numeros.sort(reverse=True)

print("Los numeros que ingreso son: ", numeros )
