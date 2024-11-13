from dataclasses import replace


def ejercicio1():
    nom_usuario = input("Escribe su nombre:")
    print(nom_usuario)

def ejercicio2():
    cad_mayus = input("Escribe un texto:")
    print(cad_mayus.upper())

def ejercicio3():
    contar_a = input("Escribe un texto:")
    print(contar_a.count("a"))

def ejercicio5():
    texto = input("Escribe un texto:")
    elim_espacio = texto.replace(' ', '')
    print(elim_espacio)

def ejercicio6():
    a = "a"
    e = "e"
    i = "i"
    o = "o"
    u = "u"
    texto1 = input("Escribe un texto:")
    texto_minus = texto1.lower()
    texto_sin_a = texto_minus.replace(a, '')
    texto_sin_b = texto_sin_a.replace(e, '')
    texto_sin_c = texto_sin_b.replace(i, '')
    texto_sin_d = texto_sin_c.replace(o, '')
    texto_sin_e = texto_sin_d.replace(u, '')
    print(texto_sin_e)

def ejercicio7():
    texto2 = input("Escribe un texto:")
    contar_palabras = texto2.count(' ') + 1
    print(contar_palabras)

def ejercicio9(palabra, letra1, letra2):
    print(palabra.replace(letra1, letra2))

def ejercicio10(cadena):
    lista = ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
    for num in lista:
        cadena = cadena.replace(num, "")
    print(cadena)


def ejercicio11():
    palabra1 = input("Escribe una palabra:")

    palabra2 = input("Escribe una palabra:")

    palabra3 = input("Escribe una palabra:")

    palabra4 = input("Escribe una palabra:")

    palabra5 = input("Escribe una palabra:")

    if len(palabra1) > len(palabra2) and len(palabra1) > len(palabra3) and len(palabra1) > len(palabra4) and len(palabra1) > len(palabra5):
        print(palabra1)
    elif len(palabra2) > len(palabra1) and len(palabra2) > len(palabra3) and len(palabra2) > len(palabra4) and len(palabra2) > len(palabra5):
        print(palabra2)
    elif len(palabra3) > len(palabra2) and len(palabra3) > len(palabra1) and len(palabra3) > len(palabra4) and len(palabra3) > len(palabra5):
        print(palabra3)
    elif len(palabra4) > len(palabra2) and len(palabra4) > len(palabra3) and len(palabra4) > len(palabra1) and len(palabra4) > len(palabra5):
        print(palabra4)
    elif len(palabra5) > len(palabra2) and len(palabra5) > len(palabra3) and len(palabra5) > len(palabra4) and len(palabra5) > len(palabra1):
        print(palabra5)

def ejercicio12(texto):
    palabra = input("Escribe una palabra: ")
    veces_contadas = 0
    for palabra in texto:
        if palabra in texto:
            veces_contadas += 1
    print("La palabra ha aparecido", veces_contadas, "veces.")

ejercicio12("hola que tal que")