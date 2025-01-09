import random  # Importa el módulo random para generar números aleatorios

# Se solicitan los nombres de los dos jugadores
jugador1 = input("Ingrese el nombre del primer jugador: ")
jugador2 = input("Ingrese el nombre del segundo jugador: ")

# Estas listas representan las posiciones de los barcos para cada jugador
posiciones1 = ["O","O","O","O","O","O","O","O","O","O"]  # Posiciones del jugador 1
posiciones2 = ["O","O","O","O","O","O","O","O","O","O"]  # Posiciones del jugador 2

# Estas listas muestran las posiciones ocultas para que el otro jugador no vea dónde están los barcos
posiciones1ocultas = ["O","O","O","O","O","O","O","O","O","O"]  # Posiciones ocultas del jugador 1
posiciones2ocultas = ["O","O","O","O","O","O","O","O","O","O"]  # Posiciones ocultas del jugador 2

# Función principal del juego
def juego():

    puntuaje1 = 0  # Puntuación inicial del jugador 1
    puntuaje2 = 0  # Puntuación inicial del jugador 2
    turnos = 6  # Número total de turnos (3 para cada jugador)

    # Función que asigna los barcos a posiciones aleatorias
    def ubicacion_barcos(posiciones):
        puntos = 3  # Los barcos tendrán valores de 3, 4 y 5 puntos

        while puntos < 6:  # Se colocan 3 barcos en total (3, 4 y 5 puntos)
            numero = random.randint(0, 9)  # Genera una posición aleatoria entre 0 y 9

            if posiciones[numero] == "O":  # Verifica si la posición está libre
                posiciones[numero] = puntos  # Asigna el valor del barco
                puntos += 1  # Pasa al siguiente barco (con más puntos)

    # Función que ejecuta el turno de disparo de un jugador
    def buscar_barcos(jugador, posiciones, puntuaje, posiciones_ocultas):
        lista = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]  # Lista de opciones para que el jugador dispare
        print(lista)  # Muestra la lista de posiciones disponibles
        posicion = int(input("Introduce que numero quieres disparar: "))  # El jugador elige una posición
        posicion -= 1  # Restamos 1 para ajustar el índice (listas en Python empiezan en 0)

        if posiciones[posicion] == "O":  # Si en esa posición no hay barco
            print("¡Agua!")  # Se informa que no se ha golpeado un barco
            posiciones_ocultas[posicion] = "A"  # Marca "A" de "agua" en la lista oculta
            print(posiciones_ocultas)  # Muestra el tablero oculto con la actualización
            print(jugador," tiene ", puntuaje," puntos.")  # Muestra la puntuación actual del jugador

        else:  # Si en la posición había un barco
            print("¡Tocado y hundido!")  # Informa que se ha golpeado un barco
            puntuaje += posiciones[posicion]  # Suma el valor del barco a la puntuación
            posiciones_ocultas[posicion] = "X"  # Marca "X" de golpe acertado en la lista oculta
            print(posiciones_ocultas)  # Muestra el tablero oculto con la actualización
            print(jugador," tiene ", puntuaje," puntos.")  # Muestra la nueva puntuación del jugador

        return puntuaje  # Retorna la puntuación actualizada del jugador

    # Se colocan los barcos de ambos jugadores
    ubicacion_barcos(posiciones1)
    ubicacion_barcos(posiciones2)

    # Bucle principal del juego: se alternan los turnos
    while turnos > 0:

        if turnos % 2 == 0:  # Si el turno es par, es el turno del jugador 1
            print("#######################################################")
            print("Es el turno de", jugador1)
            puntuaje1 = buscar_barcos(jugador1, posiciones2, puntuaje1, posiciones2ocultas)  # El jugador 1 dispara

        else:  # Si el turno es impar, es el turno del jugador 2
            print("#######################################################")
            print("Es el turno de", jugador2)
            puntuaje2 = buscar_barcos(jugador2, posiciones1, puntuaje2, posiciones1ocultas)  # El jugador 2 dispara

        turnos -= 1  # Se reduce el número de turnos en 1

    # Compara las puntuaciones al final del juego para determinar el ganador
    if puntuaje1 > puntuaje2:
        print("Ha ganado", jugador1, "con", puntuaje1, "puntos", "y", jugador2, "ha conseguido", puntuaje2, "puntos")

    elif puntuaje2 > puntuaje1:
        print("Ha ganado", jugador2, "con", puntuaje2, "puntos", "y", jugador1, "ha conseguido", puntuaje1, "puntos")

    else:
        print("Han quedado empate")  # Si las puntuaciones son iguales, es empate

# Llamada para iniciar el juego
juego()