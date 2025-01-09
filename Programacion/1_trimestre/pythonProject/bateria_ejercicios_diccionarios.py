from idlelib.editor import keynames

juguetes = {
    "pelota": 10,
    "muñeca": 15,
    "coche": 20,
    "rompecabezas": 18,
    "peluche": 12,
    "robot": 25,
    "pistola de agua": 8,
    "tren de juguete": 22,
    "oso de peluche": 14,
    "cometa": 10,
    "bloques de construcción": 30,
    "balón de fútbol": 16,
    "patineta": 35,
    "avión de juguete": 24,
    "casa de muñecas": 28
}

def ejercicio2():
    valor_persona = input("Ingrese el juguete del que quieras saber el precio: ")
    print(juguetes[valor_persona])

def ejercicio3():
    juguetes["tren de juguete"] = 26
    print(juguetes)

def ejercicio4():
    juguetes["balón de rugby"] = 40
    print(juguetes)

def ejercicio5():
    for juguete in juguetes:
        print(juguete, juguetes[juguete])

def ejercicio6():
    lista_precios = []
    for juguete in juguetes:
        lista_precios.append(juguetes[juguete])
    suma = sum(lista_precios)
    print(suma/16)

def ejercicio7():
    juguete_eliminado = input("Ingrese el juguete que quieras eliminar: ")
    if juguete_eliminado in juguetes:
        juguetes.pop(juguete_eliminado)
        print(juguetes)
    else:
        print("El juguete no existe")

def ejercicio8():
    precio_limite = int(input("Ingrese el precio límite que quieras poner: "))
    for juguete in juguetes:
        if precio_limite > juguetes[juguete]:
            print(juguete)

def ejericio9():
    


