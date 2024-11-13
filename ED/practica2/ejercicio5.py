a = ((1, 2, 3),
     (3, 2, 1))

b = ((1, 2),
     (3, 4),
     (5, 6))

#Inicializamos la matriz resultado con ceros
result = [[0 for _ in range(len(b[0]))] for _ in range(len(a))]

#Realizamos la multiplicación de matrices
for i in range(len(a)):
    for j in range(len(b[0])):
        for k in range(len(b)):
            result[i][j] += a[i][k] * b[k][j]

#Imprimimos el resultado
for row in result:
    print(row)
