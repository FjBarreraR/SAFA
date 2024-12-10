def ej_1(texto):
    contador_1 = 0
    contador_2 = 0
    contador_3 = 0
    contador_4 = 0
    contador_5 = 0
    contador_6 = 0
    contador_7 = 0
    contador_8 = 0
    contador_9 = 0
    contador_10 = 0
    contador_11 = 0
    contador_12 = 0

    print("Signos de puntuación encontrados: ")
    for i in texto:
        if i == ",":
            contador_1 += 1
        if i == ";":
            contador_2 += 1
        if i == ":":
            contador_3 += 1
        if i == "(":
            contador_4 += 1
        if i == "[":
            contador_5 += 1
        if i == "¿":
            contador_6 += 1
        if i == ".":
            contador_7 += 1
        if i == '"':
            contador_8 += 1
        if i == "...":
            contador_9 += 1
        if i == "-":
            contador_10 += 1
        if i == "!":
            contador_11 += 1
        if i == "ü":
            contador_12 += 1

    print(f"Número de comas {contador_1}")
    print(f"Número de punto y comas {contador_2}")
    print(f"Número de dos puntos {contador_3}")
    print(f"Número de paréntesis {contador_4}")
    print(f"Número corchetes {contador_5}")
    print(f"Número de interrogaciones {contador_6}")
    print(f"Número de puntos {contador_7}")
    print(f"Número comillas {contador_8}")
    print(f"Número de puntos suspensivos {contador_9}")
    print(f"Número de guiones {contador_10}")
    print(f"Número de admiraciones {contador_11}")

def ej_2():
    palabra_oculta = "barcos"
    vidas = 5
    lista_palabra_oculta = ["_", "_", "_", "_", "_", "_"]
    lista_palabra_dichas = []
    while lista_palabra_oculta == ["b", "a", "r", "c", "o", "s"] or vidas != 0:
        pregunta = input("Dime una letra: ")

        if pregunta == "b":
            lista_palabra_oculta.pop(0)
            lista_palabra_oculta.insert(0, pregunta)
            print(f"Palabra : {lista_palabra_oculta}")
            print(f"Vidas: {vidas}")

        elif pregunta == "a":
            lista_palabra_oculta.pop(1)
            lista_palabra_oculta.insert(1, pregunta)
            print(f"Palabra : {lista_palabra_oculta}")
            print(f"Vidas: {vidas}")

        elif pregunta == "r":
            lista_palabra_oculta.pop(2)
            lista_palabra_oculta.insert(2, pregunta)
            print(f"Palabra : {lista_palabra_oculta}")
            print(f"Vidas: {vidas}")


        elif pregunta == "c":
            lista_palabra_oculta.pop(3)
            lista_palabra_oculta.insert(3, pregunta)
            print(f"Palabra : {lista_palabra_oculta}")
            print(f"Vidas: {vidas}")

        elif pregunta == "o":
            lista_palabra_oculta.pop(4)
            lista_palabra_oculta.insert(4, pregunta)
            print(f"Palabra : {lista_palabra_oculta}")
            print(f"Vidas: {vidas}")

        elif pregunta == "s":
            lista_palabra_oculta.pop(5)
            lista_palabra_oculta.insert(5, pregunta)
            print(f"Palabra : {lista_palabra_oculta}")
            print(f"Vidas: {vidas}")

        else:
            vidas -= 1
            print(f"Tienes {vidas} vidas")

        if pregunta in lista_palabra_dichas:
            print("Letra ya dicha")
            vidas -= 1
            print(f"Tienes {vidas} vidas")
            print(f"Palabra : {lista_palabra_oculta}")
            print(f"Palabras dichas: {lista_palabra_dichas}")
        else:
            lista_palabra_dichas.append(pregunta)
            print(f"Palabras dichas: {lista_palabra_dichas}")

        if vidas == 0:
            print("Perdiste")
            break

        if lista_palabra_oculta == ["b", "a", "r", "c", "o", "s"]:
            print("Ganaste")
            break
def ej_3_1():
    alumnos = [{
        "nombre": "Enrique",
        "apellidos": "García, Migueza",
        "dni": "12345678K",
        "email": "egarciamigueza@safareyes.es",
    },
    {
        "nombre": "Paloma",
        "apellidos": "Machado, López",
        "dni": "12345678Z",
        "email": "pmachadolopez@hotmail.es@",
    },
    {
        "nombre": "Antonio",
        "apellidos": "Romero, Domínguez",
        "dni": "12345678A",
        "email": "aromerodominguez@safareyes.es",
    }]
    print("Email encontrados :")
    for alumno in alumnos:
        correo = alumno["email"]
        if "@safareyes.es" in correo:
            print(f"{alumno['nombre']}")

def ej_3_2(lista_alumnos):
    lista_apellidos = []

    for alumno in lista_alumnos:
        lista_apellidos.append(alumno["apellidos"])

    lista_apellidos.sort()

    apellido_primer_alumno = lista_apellidos[0]
    print(apellido_primer_alumno)


def ej_4(list):
   promedio = sum(list)/ len(list)
   print(f"La media calculada sería: {promedio}")

   if promedio < 5:
       print("Suspenso")

   elif promedio > 5 and promedio < 7:
       print("Aprobado")

   elif promedio > 7 and promedio < 9:
       print("Notable")

   elif promedio > 9:
       print("Sobresaliente")

   else:
    print("No válido")

def ej_5(password):
    empieza_y_termina_mayuscula = False
    valor_numerico = False
    simbolo = False
    if password[0].isupper() and password[-1].isupper():
        empieza_y_termina_mayuscula = True
    for letra in password:
        if letra.isnumeric():
            valor_numerico = True
    if password.count("_") or password.count(".") or password.count("#"):
        simbolo = True

ej_5("Loli6t_e")
