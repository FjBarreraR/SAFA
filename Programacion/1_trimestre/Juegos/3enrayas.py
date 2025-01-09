tablero = [[0,1,2],[3,4,5],[6,7,8]] #Creamos una lista con las posiciones del tablero

jugadorX = input("Ingrese tu nombre jugadorX: ") #Creamos una variable para apuntar el nombre del jugador X
jugadorO = input("Ingrese tu nombre jugadorO: ") #Creamos una variable para apuntar el nombre del jugador O

def pinta_tablero(): #Creamos una función que pinta el tablero

    for fila in tablero: #Creamos un bucle que recorra las filas del tablero

        print(fila)

def ganador(jugador): #Creamos una función para comprobar si alguien ha ganado

    for fila in tablero: #Creamos un bucle que recorra las filas del tablero

        if fila[0] == fila[1] == fila[2] == jugador: #Comprobamos las horizontales
            return True

    for i in range(3): #Creamos que se repita 3 veces

        if tablero[0][i] == tablero[1][i] == tablero[2][i] == jugador: #Comprobamos las verticales
            return True

    if tablero[0][0] == tablero[1][1] == tablero[2][2] == jugador: #Comprobamos la diagonal de izquierda a derecha
        return True

    if tablero[0][2] == tablero[1][1] == tablero[2][0] == jugador: #Comprobamos la diagonal de derecha a izquierda
        return True

    return False

def colocar_pieza(jugador): #Creamos una función para que el jugador puede colocar su pieza

    posicion = int(input("Ingrese la posicion donde quieres colocar tu pieza: ")) # Creamos una variable para apuntar la posicion
    posicion_valida = 0 #Creamos una variable que nos avisara si la pieza se puede colocar


    for i in range(len(tablero)):  # Creamos un bucle que recorra el tablero

        for j in range(len(tablero[i])):

            if tablero[i][j] == posicion:
                tablero[i][j] = jugador #Colocamos la pieza
                posicion_valida=1 #Cabiamos de valor la variable porque la pieza se ha podido colocar

    if posicion_valida==0: #La pieza no se puede colocar
        print("Tu pieza no puede colocar")
        colocar_pieza(jugador) #Llamamos de nuevo a la funcion para que pregunte otra posición


pinta_tablero() #pintamos el tablero
turnos = 1 #Creamos una variable para crear el primer turno

for i in range(9): #Creamos un bucle

    if turnos %2==0: #Subcondicion para asegurarnos que es el primer turno
        print("Es el turno de ", jugadorX)
        colocar_pieza("X") #Llamamos a la funcion para colocar la pieza
        pinta_tablero() #pintamos el tablero

    else:
        print("Es el turno de",jugadorO)
        colocar_pieza("O") #Llamamos a la funcion para colocar la pieza
        pinta_tablero() #Pintamos el tablero

    if ganador("X"): #Comprobamos si ha ganado
        print(jugadorX," ha hecho 3 en rayas")
        break

    if ganador("O"):#Comprobamos si ha ganado
        print(jugadorO," ha hecho 3 en rayas")
        break

    turnos += 1

if not ganador("X") and not ganador("O"): #Comprobamos si han quedado empate
    print("El juego terminó en empate.")