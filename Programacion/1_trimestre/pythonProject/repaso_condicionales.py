def ejercicio1(n1, n2, n3):
    if n1 > n2 and n1 > n3:
        print("El número más grande es el:", n1)
    elif n2 > n1 and n2 > n3:
        print("El número más grande es el:", n2)
    elif n3 > n1 and n3 > n2:
        print("El número más grande es el:", n3)

def ejercicio2():
    palabra = input("Escriba una palabra: ")
    if len(palabra) > 8 and not len(palabra) == "":
        print(palabra)
    else:
        print("La palabra no cumple los requisitos")

def ejercicio3():
    p1 = input("Escriba una palabra: ")
    p2 = input("Escriba una palabra: ")
    p3 = input("Escriba una palabra: ")
    p4 = input("Escriba una palabra: ")
    if len(p1) > len(p2) and len(p1) > len(p3) and len(p1) > len(p4):
        print("La palabra más grande es", p1)
    elif len(p2) > len(p1) and len(p2) > len(p3) and len(p2) > len(p4):
        print("La palabra más grande es", p2)
    elif len(p3) > len(p1) and len(p3) > len(p2) and len(p3) > len(p4):
        print("La palabra más grande es", p3)
    elif len(p4) > len(p1) and len(p4) > len(p3) and len(p4) > len(p2):
        print("La palabra más grande es", p4)
    if len(p1) < len(p2) and len(p1) < len(p3) and len(p1) < len(p4):
        print("La palabra más pequeña es", p1)
    elif len(p2) < len(p1) and len(p2) < len(p3) and len(p2) < len(p4):
        print("La palabra más pequeña es", p2)
    elif len(p3) < len(p1) and len(p3) < len(p2) and len(p3) < len(p4):
        print("La palabra más pequeña es", p3)
    elif len(p4) < len(p1) and len(p4) < len(p3) and len(p4) < len(p2):
        print("La palabra más pequeña es", p4)

def ejercicio4(n1, n2, n3, n4, n5):
    numeros = [n1, n2, n3, n4, n5]
    divisor = n5
    for num in numeros:
        if num % divisor == 0:
            print(num)

def palabras_con_mas_de_tres_vocales(palabra1, palabra2, palabra3):
    # Función para contar vocales en una palabra
    def contar_vocales(palabra):
        vocales = 'aeiouáéíóú'
        return sum(1 for letra in palabra.lower() if letra in vocales)

    # Lista de palabras
    palabras = [palabra1, palabra2, palabra3]

    # Revisar e imprimir palabras con más de 3 vocales
    for palabra in palabras:
        if contar_vocales(palabra) > 3:
            print(palabra)

# Ejemplo de uso
palabras_con_mas_de_tres_vocales("elefante", "cangrejo", "murciélago")







