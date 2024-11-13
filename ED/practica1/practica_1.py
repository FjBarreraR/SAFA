def ejercicio1():
    asignaturas = ["informatica", "Francés", "Filosofía", "Ética", "Álgebra"]
    for asignatura in asignaturas:
        print("Yo estudio",asignatura)

def ejercicio2():
    a = (1,2,3)
    b = (-1,0,2)
    product = 0
    for i in range(len(a)):
        product += a[i-1]*b[i-1]
    print("El producto de los vectores " + str(a) + " y " + str(b) + " es " + str(product))

def ejercicio3():
    def count_words(text):
        text = text.split()
        words = {}
        for i in text:
            if i in words:
                words[i] += 1
            else:
                words[i] = 1

        return words

    def most_repeated(words):
        max_word = ""
        max_freq = 0
        for word, freq in words.items():
            if freq > max_freq:
                max_word = word
                max_freq = freq
        return max_word, max_freq

    text = "Como quieres que te quiera si el que quiero que me quiera no me quiere como quiero que me quiera"
    print(count_words(text))
    print(most_repeated(count_words(text)))

def ejercicio4():
    contrasenya = "1234EDD"
    usuario_contra = input("Introduce la contraseña: ")

    while usuario_contra != contrasenya:
        print("La contraseña es incorrecta")
        usuario_contra = input("Introduce la contraseña: ")
    if usuario_contra == contrasenya:
        print("La contraseña es correcta")

def ejercicio5():
    frase = input("Introduce una frase: ")
    letra = input("Introduce una letra: ")
    contador = 0
    for i in frase:
        if i == letra:
            contador += 1
    print("la letra",letra, "aparece", contador, "veces en la frase")

def ejercicio6():
    a = ((1,2,3,),
         (4,5,6))
    b = ((-1,2),
         (0,1),
         (1,1))
    result = [[0,0],
              [0,00]]
    for i in range(len(a)):
        for j in range(len(b[0])):
            for k in range(len(b)):
                result[i][j] += a[i][k] * b[k][j]
    for i in range(len(result)):
        result[i] = tuple(result[i])
    result = tuple(result)
    for i in range(len(result)):
        print(result[i])

def ejercicio7():
    list_precios = [50,75,46,22,80,65,8]
    mayor_precio = max(list_precios)
    menor_precio = min(list_precios)
    print("El mayor precio es:", mayor_precio)
    print("El menor precio es:", menor_precio)

def ejercicio8():
    def to_decimal(n):
        n = list(n)
        n.reverse()
        decimal = 0
        for i in range(len(n)):
            decimal += int(n[i]) * 2 ** 1
        return decimal
    def to_binary(n):
        binary = []
        while n > 0:
            binary.append(n % 2)
            n = n // 2
        return ''.join(binary)
    print(to_decimal('10110'))
    print(to_binary(22))
    print(to_decimal(to_binary(22)))
    print(to_binary(to_decimal('10110')))