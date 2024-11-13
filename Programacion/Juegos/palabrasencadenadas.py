import random

def juego():  # Función principal que inicia y controla el juego
    print("##################################") #Separador
    while True:
        # Solicitar el número de jugadores (mínimo 2)
        num_jugadores = input("¿Cuántos jugadores participarán? (2 o más): ")
        if num_jugadores.isdigit() and int(num_jugadores) >= 2:
            num_jugadores = int(num_jugadores)
            break  # Salir del bucle cuando el número de jugadores es válido
        else:
            print("Entrada inválida. Debe ser un número entero de 2 o más jugadores.")

    # Registrar los nombres de los jugadores
    jugadores = [input(f"Ingrese el nombre del jugador {i + 1}: ") for i in range(num_jugadores)]

    # Mostrar una palabra inicial aleatoria
    palabras_iniciales = ["Colorear", "Onda", "Rural", "Casa", "Puñetazo", "Bota", "Cálido", "Polvo", "Falsificación",
                          "Ilustre"]
    print(random.choice(palabras_iniciales))

    ultima_palabra = ""  # Almacena la última palabra válida dicha
    palabra_dicha = []  # Almacena todas las palabras ya usadas

    def es_palabra_valida(palabra, ultima_palabra):  # Función para verificar si la palabra es válida
        if ultima_palabra:
            return palabra.startswith(
                ultima_palabra[-2:])  # Verifica si la palabra comienza con las dos últimas letras de la anterior
        return True  # Siempre válida si no hay palabra anterior

    # Lógica principal del juego
    while True:
        # Solicitar una palabra del jugador o terminar el juego con "fin"
        palabra = input("Ingrese la palabra que desea enviar (Si no encuentras, escriba *fin*): ")

        if palabra.lower() == "fin":  # Terminar el juego si el jugador escribe "fin"
            print("El Juego ha terminado")
            break

        if es_palabra_valida(palabra, ultima_palabra):  # Verifica si la palabra es válida
            if palabra.lower() not in palabra_dicha:  # Verifica si la palabra no ha sido usada antes
                palabra_dicha.append(palabra.lower())  # Añade la palabra a la lista de usadas
                ultima_palabra = palabra.lower()  # Actualiza la última palabra válida
                print(f"La palabra '{palabra}' es válida. Continua el siguiente jugador.")
                print("##################################") #Separador
            else:
                # La palabra ya fue usada, el jugador pierde
                print(f"La palabra '{palabra}' ya ha sido utilizada. Has perdido.")
                if input("¿Quieres jugar de nuevo? (Escriba *si* o *no*): ").lower() == "si":
                    juego()  # Reiniciar el juego si el jugador quiere volver a jugar
                else:
                    print("Gracias por jugar. ¡Hasta la próxima!")
                    break
        else:
            # La palabra no cumple la regla de empezar con las dos últimas letras de la palabra anterior
            print(f"La palabra '{palabra}' no es válida. Debe comenzar con las dos últimas letras de '{ultima_palabra}'.")


# Ejecución del juego principal en un bucle
while True:
    juego()  # Inicia el juego
    # Pregunta si se quiere jugar de nuevo al finalizar una ronda completa
    if input("¿Quieres jugar de nuevo? (Escriba *si* o *no*): ").lower() != "si":
        print("Gracias por jugar. ¡Hasta la próxima!")
        break  # Termina el bucle si no se quiere volver a jugar