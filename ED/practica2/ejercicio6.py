def procesar_datos():
    lista_datos = [10, -3, 0, 5, "a", -8]
    resultados = []

    for dato in lista_datos:
        if isinstance(dato, (int, float)):  # Verificar que sea numérico
            if dato > 0:
                resultado = dato * 2
            elif dato == 0:
                resultado = "Cero"
            else:
                resultado = abs(dato / 2)
            resultados.append(resultado)
        else:
            resultados.append("No numérico")  # Manejo de valores no numéricos

    # Filtrar solo los valores numéricos para calcular el promedio
    resultados_numericos = [res for res in resultados if isinstance(res, (int, float))]

    if resultados_numericos:  # Evitar división por cero
        promedio = sum(resultados_numericos) / len(resultados_numericos)
    else:
        promedio = 0
    return promedio, resultados

promedio, resultados = procesar_datos()
print("Promedio de los resultados: ", promedio)
print("Lista de resultados procesados: ", resultados)
