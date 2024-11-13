#Importa para poder generar un número aleatorio
import random

intentos = 0 # Creamos una variable para acumular intentos

vidas = 3 # Creamos una variable con el numero de vidas

numeros_dichos = [] # Creamos una lista para guardar todos los numeros dichos

numero_secreto = random.randint(100, 999) # Generamos un numero aleatorio

nombre = input("Introduce tu nombre:") # Preguntamos el nombre a nuestro jugador
print("Bienvenido ",nombre,)
print("En estos momentos me encuentro pensando en un número.")
print("¿Eres capaz de adivinarlo?. Es un número del 100 al 999 y solo vas a tener 3 intentos.")


cadena_numero_secreto = str(numero_secreto)
print(cadena_numero_secreto[1])
print(cadena_numero_secreto[0])
print(cadena_numero_secreto[2])

while numero_secreto not in numeros_dichos and vidas > 0: #Creamos un bucle que se ejecute siempre y cuando tengamos vidas o el número no sea correcto

    numero_jugador = int(input("Escribeme un número: ")) #Aseguramos que sea un número entero

    if numero_jugador not in numeros_dichos: #Creamos una condición para saber si el número ha salido antes

        if numero_jugador > numero_secreto: #Subcondición donde el numero del jugador se compara con el numero aleatorio y si es mayor pierde una vida e imprime un texto
            print("El número es mayor que el número secreto")
            vidas -= 1 #Resta una vida en la variable
            numeros_dichos.append(numero_jugador) #Lo agregamos a la lista de dichos
            print("Te quedan ", vidas, " vidas")
            print("###########################")  # Separador

        if numero_jugador < numero_secreto: #Subcondición donde el numero del jugador se compara con el numero aleatorio y si es menor pierde una vida e imprime un texto
            print("El número es menor que el número secreto")
            vidas -= 1
            numeros_dichos.append(numero_jugador) #Lo agregamos a la lista de dichos
            print("Te quedan ",vidas," vidas")
            print("###########################")  #Separador

        if numero_jugador == numero_secreto:
            print("Enhorabueno, has ganado el juego")
            print("Te han quedado ",vidas," vidas")
            numeros_dichos.append(numero_jugador)

    else:#
        print("Este número ya está dicho")
        print("Esto son los numeros dichos: ",numeros_dichos)
        print("###########################")  # Separador

if vidas == 0:
    print("¡Has perdido!")
    print("El número secreto era ",numero_secreto)