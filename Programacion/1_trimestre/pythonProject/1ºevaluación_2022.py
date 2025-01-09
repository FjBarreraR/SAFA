def ej_1(lista, texto):
    for palabra in lista:
        texto = texto.title()
        contar_1 = texto.count(palabra)
        print(f"{palabra} aparece {contar_1} veces")
#ej_1(["Tití", "Novia", "Casa", "Bunny"],"Ey, Tití me preguntó Si tengo muchas novia' Muchas novia' Hoy tengo a una, mañana otra Ey, pero no hay boda Tití me preguntó Si tengo muchas novia' Je, muchas novia' Hoy tengo a una, mañana otra")

def ej_2(preguntas, numero_pers):
    contador = 1
    lista_respuesta = []
    for pregunta in preguntas:
        lista_respuesta.append([])

    while contador <= numero_pers:
        contador_pregunta = 0
        print(f"----------ENTREVISTADO {contador}---------- ")
        for pregunta in preguntas:
            respuesta = input(f"{pregunta} :")
            lista_respuesta[contador_pregunta].append(respuesta)
            print(f"{pregunta} {respuesta}")
            contador_pregunta += 1
        contador += 1


    print("------------------RESUMEN ENCUESTA-------------------")
    print("-----------------------------------------------------")
    counter = 1
    counter_pregunta = 0
    for pregunta in preguntas:
        print(f"pregunta {counter} --> {pregunta}")
        print(f"respuestas --> {lista_respuesta[counter_pregunta]}")
        counter += 1
        counter_pregunta += 1
    print("-----------------------------------------------------")

#ej_2(["Cual es tu color favorito?", "Comida favorita?"], 2)

def ej_4(num):
    lista_divisible = []
    contador = 1
    while contador < 10:
        if num % contador == 0:
            lista_divisible.append(contador)
        contador += 1
    print(lista_divisible)


def ej_3_1():
    pokemons =[{
    "nombre ": "Treecko",
    "pokédex": 252,
    "tipo": ["PLANTA"],
    "evo": 1,
    },
    {
    "nombre ": "Roselia",
    "pokédex": 407,
    "tipo": ["PLANTA", "VENENO"],
    "evo": 2,
    },
    {
    "nombre ": "Milotic",
    "pokédex": 350,
    "tipo": ["AGUA"],
    "evo": 2,
    },
    {
    "nombre ": "Altaria",
    "pokédex": 334,
    "tipo": ["VOLADOR","DRAGÓN"],
    "evo": 2,
    }]
    lista = []
    for pokemon in pokemons:
        lista.append(pokemon["pokédex"])
    print(sorted(lista, reverse=True))


def ej_3_2(elemento):
    pokemons = [{
    "nombre ": "Treecko",
    "pokédex": 252,
    "tipo": ["PLANTA"],
    "evo": 1,
    },
    {
    "nombre ": "Roselia",
    "pokédex": 407,
    "tipo": ["PLANTA", "VENENO"],
    "evo": 2,
    },
    {
    "nombre ": "Milotic",
    "pokédex": 350,
    "tipo": ["AGUA"],
    "evo": 2,
    },
    {
    "nombre ": "Altaria",
    "pokédex": 334,
    "tipo": ["VOLADOR", "DRAGÓN"],
    "evo": 2,
    }]
    listas = []
    lista_elemento = []
    for pokemon in pokemons:
        listas.append(pokemon["tipo"])
    for lista in listas:
        for elementos in lista:
            if elementos == elemento:
                lista_elemento.append(pokemon["nombre "])

    print(lista_elemento)

ej_3_2("PLANTA")

def ej_3_3():
    lista_nombre = []
    lista_numeros = []
    lista_tipos = []
    lista_evo = []

    pokemons = [{
    "nombre ": "Treecko",
    "pokédex": 252,
    "tipo": ["PLANTA"],
    "evo": 1,
    },
    {
    "nombre ": "Roselia",
    "pokédex": 407,
    "tipo": ["PLANTA", "VENENO"],
    "evo": 2,
    },
    {
    "nombre ": "Milotic",
    "pokédex": 350,
    "tipo": ["AGUA"],
    "evo": 2,
    },
    {
    "nombre ": "Altaria",
    "pokédex": 334,
    "tipo": ["VOLADOR", "DRAGÓN"],
    "evo": 2,
    }]

    for pokemon in pokemons:
        lista_nombre.append(pokemon["nombre "])
        lista_numeros.append(pokemon["pokédex"])
        lista_tipos.append(pokemon["tipo"])
        lista_evo.append(pokemon["evo"])

    print(f"Nombres = {lista_nombre}")
    print(f"Numeros = {lista_numeros}")
    print(f"Tipos = {lista_tipos}")
    print(f"Evo = {lista_evo}")