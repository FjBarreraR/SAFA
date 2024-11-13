#ejercicio 1
def num_mas_grande(num1, num2, num3):
    if num1 > num2 and num1 > num3:
        print("El número más grande es el " + str(num1))
    elif num2 > num1 and num2 > num3:
        print("El número más grande es el " + str(num2))
    elif num3 > num1 and num3 > num2:
        print("El número más grande es el " + str(num3))
    else:
        print("Todos los números son iguales")

def palabra_mas_8_letras():
    palabra = input("Escribe una palabra:")
    if len(palabra) >= 8 and palabra != "":
        print(palabra)
    else:
        print("No se cumplen las condiciones")

def mas_grande_mas_pequena():
    palabra1 = input("Escribe una palabra:")
    palabra2 = input("Escribe una palabra:")
    palabra3 = input("Escribe una palabra:")
    palabra4 = input("Escribe una palabra:")
    if len(palabra1) > len(palabra2) and len(palabra1) > len(palabra3) and len(palabra1) > len(palabra4):
        print("La palabra más grande es", palabra1)
    elif len(palabra2) > len(palabra3) and len(palabra2) > len(palabra4) and len(palabra2) > len(palabra1):
        print("La palabra más grande es", palabra2)
    elif len(palabra3) > len(palabra4) and len(palabra3) > len(palabra1) and len(palabra3) > len(palabra2):
        print("La palabra más grande es", palabra3)
    elif len(palabra4) > len(palabra1) and len(palabra4) > len(palabra2) and len(palabra4) > len(palabra3):
        print("La palabra más grande es", palabra4)
    elif len(palabra1) < len(palabra2) and len(palabra1) < len(palabra3) and len(palabra1) < len(palabra4):
        print("La palabra más pequeña es", palabra1)
    elif len(palabra2) < len(palabra1) and len(palabra2) < len(palabra3) and len(palabra2) < len(palabra4):
        print("La palabra más pequeña es", palabra2)
    elif len(palabra3) < len(palabra1) and len(palabra3) < len(palabra2) and len(palabra3) < len(palabra4):
        print("La palabra más pequeña es", palabra3)
    elif len(palabra4) < len(palabra1) and len(palabra4) < len(palabra2) and len(palabra4) < len(palabra3):
        print("La palabra más pequeña es", palabra4)
    else:
        print("Hay palabras que son iguales")

def ejercicio4(n1,n2,n3,n4,n5):
    if n1 % n5 == 0:
        print(n1)
    if n2 % n5 == 0:
        print(n2)
    if n3 % n5 == 0:
        print(n3)
    if n4 % n5 == 0:
        print(n4)
    if n5 % n5 == 0:
        print(n5)

def ejercicio5(p1,p2,p3):
    vocales = ("a" , "e", "i", "o", "u")

def ejercicio6():