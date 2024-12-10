

def ej_1(texto):
    contador = 0
    texto = texto
    for palabra in texto:
        for letra in palabra:
            if letra.isupper() and letra != "A" and letra != "E" and letra != "I" and letra != "O" and letra != "U" and letra != " ":
                contador += 1

    print(f"El programa devolverá: {contador}")

# ej_1("Finalmente tras el día de ayer el Real Madrid y el Barcelona siguen adelante en la Copa del Rey")

def ej_2(list_num):
    lista = []
    for num in list_num:
        if num % 2 == 0 and num % 3 == 0 and num == int(num):
            lista.append(num)
    print(lista)

# ej_2([4.5 , 6 , 10.3 , 12.4 , 15.0 , 18 , 24 ])

def ej_5(lista_pal, lista_num):
    contador = -1
    for palabra in lista_pal:
        if palabra.isnumeric() or palabra == "":
            print("No puedo realizar la operación")
            break
        contador += 1
        for num in lista_num:
            if num == "":
                print("No puedo realizar la operación")
        print(lista_pal[contador] * lista_num[contador])

# ej_5([ "hola" , "cómo" , "estás"], [3,1,1])

def ej_3(list_jug, personas):
    contador = 0
    contador_per = 0
    lista_valoracion = []
    while personas >= contador:
        lista = []
        for jugador in list_jug:
            print(f"-----------VALORACIÓN {list_jug[contador].upper()}----------")
            valoracion = int(input("Que nota le das a este futbolista ?: "))
            contador_per += 1
            print(f"Persona {contador_per} --> {valoracion}")
            lista.append(valoracion)
            if contador_per >= personas:
                break
        contador += 1
        contador_per = 0
        lista_valoracion.append(lista)

    print("-------RESUMEN VALORACIONES----------")
    counter = 0
    contado = 0
    for jugador in list_jug:
        for lista in lista_valoracion:
            media = sum(lista) / personas
            if counter == len(lista_valoracion):
                break
            counter += 1
            print(f"{list_jug[contado]} (Media Obtenida) --> {media}")
            contado += 1
# ej_3( ["Haaland ", "Mbappe", "Vinicius Jr" ], 2)


def ej_4_1():
    coches =[{
    "modelo": "Gallardo",
    "marca": "Lamborghini",
    "tipo": "Deportivo",
    "puertas": 3,
    },
    {
    "modelo": "Murciélag GT",
    "marca": "Lamborghini",
    "tipo": "Carrera",
    "puertas": 2,
    },
    {
    "modelo": "Twingo",
    "marca": "Renault",
    "tipo": "Normal",
    "puertas": 5,
    }]

    lista_modelo = []
    lista_puertas = sorted(coches, key=lambda coche: coche["puertas"],reverse=True)
    for lista in lista_puertas:
        if lista["puertas"] > 2:
            lista_modelo.append(lista["modelo"])
    print(lista_modelo)


def ej_4_2(marca):
    lista = []
    coches = [{
    "modelo": "Gallardo",
    "marca": "Lamborghini",
    "tipo": "Deportivo",
    "puertas": 3,
    },
    {
    "modelo": "Murciélag GT",
    "marca": "Lamborghini",
    "tipo": "Carrera",
    "puertas": 2,
    },
    {
    "modelo": "Twingo",
    "marca": "Renault",
    "tipo": "Normal",
    "puertas": 5,
    }]

    for coche in coches:
        if coche["marca"] == marca:
            lista.append(coche["modelo"])
    print(lista)
# ej_4_2("Lamborghini")

def ej_4_3():
    lista_modelos = []
    lista_marcas = []
    lista_tipos = []
    lista_puertas = []
    coches = [{
    "modelo": "Gallardo",
    "marca": "Lamborghini",
    "tipo": "Deportivo",
    "puertas": 3,
    },
    {
    "modelo": "Murciélag GT",
    "marca": "Lamborghini",
    "tipo": "Carrera",
    "puertas": 2,
    },
    {
    "modelo": "Twingo",
    "marca": "Renault",
    "tipo": "Normal",
    "puertas": 5,
    }]
    for coche in coches:
        lista_modelos.append(coche["modelo"])
        lista_marcas.append(coche["marca"])
        lista_tipos.append(coche["tipo"])
        lista_puertas.append(coche["puertas"])
    print(f"Modelos = {lista_modelos}")
    print(f"Marcas = {lista_marcas}")
    print(f"Tipos = {lista_tipos}")
    print(f"Puertas = {lista_puertas}")

