#bucles
lista = ["perro", "gato", "cerdo", "león", "tigre", "delfín", "rata"]

for animal in lista:
    if len(animal) == 4:
        print(animal)


for i in range(10):
    print("delfin")


for i in range(15,35):
    print(i)


for letra in "caballo":
    print(letra)

def ejemplo():

    contrasenya = "aqua45land"

    for letra in contrasenya:
        if letra.isdigit():
            print("La contraseña contiene un dígito")
            break





def comprobar_contrasenya(contrasenya):
    caracteres_obligatorios = ".-*"
    contador_digitos = 0
    contador_caracteres_especiales = 0
    for letra in contrasenya:
        if letra.isdigit():
            contador_digitos += 1
        if letra in caracteres_obligatorios:
            contador_caracteres_especiales += 1

    if contador_digitos == 2 and len(contrasenya) >= 8 and contador_caracteres_especiales >= 1:
        print("Contraseña corecta")
    else:
        print("Contraseña incorrecta")
