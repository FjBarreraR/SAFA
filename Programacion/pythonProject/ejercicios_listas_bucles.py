def ejercicio2():
    lista_numeros = [4.5, 6, 10.3, 12.4, 15.0, 18, 24]
    lista_final_numeros = []
    for numero in lista_numeros:
        if numero == int(numero) and numero % 2 == 0 and numero % 3 == 0:
            lista_final_numeros.append(numero)

    print(lista_final_numeros)


def mostrar_palabras(lista_palabras, lista_numeros):

    if len(lista_palabras) != len(lista_numeros):
        print("Las listas deben tener la misma longitud.")
        return

    for palabra, numero in zip(lista_palabras, lista_numeros):
        print((palabra + ' ') * numero)

    # Ejemplo de uso
palabras = ["hola", "adios", "angela"]
numeros = [2, 3, 1]

mostrar_palabras(palabras, numeros)


