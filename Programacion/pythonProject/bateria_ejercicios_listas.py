def ejercicio1():
    nombres_clase = ["Ivan", "Aaron", "Chino"]
    print(nombres_clase[1])
    nombres_clase.append("Fran")
    print(nombres_clase)

def ejercicio2():
    numeros = ["1", "2", "3", "4", "5"]
    numeros[2] = "10"
    numeros.remove("5")
    print(numeros)

def ejercicio3():
    numeros_3 = ["1", "2", "3", "4", "5", "6", "7", "8", "9", "10"]
    for i in range(len(numeros_3)):
        print(numeros_3[i])

def ejercicio4():
    numeros_pares = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    pares = []
    for i in range(len(numeros_pares)):
        if numeros_pares[i] % 2 == 0:
            pares.append(numeros_pares[i])
    print(pares)

def ejercicio5():
    numeros_suma = [1, 2, 3, 4, 5]
    suma = sum(numeros_suma)
    print(suma)

def ejercicio6():
    matriz = [(1,2,3),(4,5,6),(7,8,9)]
    print(matriz[0])
    print(matriz[1])
    print(matriz[2])
    print(sum(matriz[0]) + sum(matriz[1]) + sum(matriz[2]))

def ejercicio7(lista):
    suma = 0
    for num in lista:
       suma += num

    return suma/len(lista)

def ejercicio8():
    calificaciones_alumnos = [8,4,6,7,2,3,0,10]
    aprobados = 0
    suspendidos = 0
    for num in calificaciones_alumnos:
        if num >= 5:
            aprobados += 1
        else:
            suspendidos += 1
    print("El número de aprobados es de ",aprobados)
    print("El número de suspensos es de ", suspendidos)

def ejercicio9():
    nombres = ["Bola","Ivan","Aaron","Chino"]
    nombres.sort()
    print(nombres)

def ejercicio10():
    lista_palabras = ["Hola", "adios","angela","fran"]
    palabra_usuario = input("Ingrese la palabra que desea buscar: ")
    if palabra_usuario in lista_palabras:
            print("La palabra ha sido encontrada")
    else:
            print("La palabra no ha sido encontrada")