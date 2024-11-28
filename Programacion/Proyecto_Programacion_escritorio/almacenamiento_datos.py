# Importar las bibliotecas necesarias para seguir con el proyecto
import csv
from idlelib.iomenu import encoding

import pandas as pd
import web_scraping as ws
import mysql.connector as bd

# La primera función para construir el archivo csv
def construir_csv():

    # Extraemos la lista que hemos creado en el otro archivo
    lista_ropa = ws.web_scraping()

    # Creación del archivo csv con el utf-8 que se utiliza para poder manejar caractares especiales
    with open('ropa_betis.csv', 'w', newline="", encoding="utf-8") as archivo_ropa:

        # Creamos un writer para que conforme vaya leyendo vaya escribiendo en el archivo
        escritor = csv.writer(archivo_ropa)

        # Primero escribimos las llaves del diccionario
        escritor.writerow(lista_ropa[0].keys())

        # Bucle para que recorra todos los diccionarios y escriba todos los valores
        for ropa in lista_ropa:
            escritor.writerow(ropa.values())

    # Pintamos por consola que el archivo se ha creado exitosamente
    print("Archivo CSV creado exitosamente.")


# Función para convertir el archivo csv a excel
def convertir_a_excel():

    # Llamamos a la primera función que hemos creado
    construir_csv()

    # Creamos una variable en la que pueda leer el archivo csv
    archivo_csv = pd.read_csv('ropa_betis.csv')

    # Creamos otra variable en la que se transforme el archivo csv a xlsx con el nombre que queramos ponerle
    archivo_excel = archivo_csv.to_excel('ropa_betis.xlsx', index=False)

    # Pintamos que el archivo se ha convertido exitosamente
    print("Archivo CSV convertido a Excel exitosamente.")

# Función para conectar con la base de datos
def conectar_bbdd():

    # Diccionario para poner los parámetros que vamos a utilizar para conectarnos
    parametros_conexion = {
        'user': 'fran_barrera',
        'password': 'fran260724',
        'host': 'localhost',
        'database': 'ropa_betis',
        'port':3306,
        'charset': 'utf8mb4',
        'use_unicode': True,
        'autocommit': True
    }

    # Devolvemos la conexión para utilizarla más adelante
    return bd.connect(**parametros_conexion)
conectar_bbdd()
# Función para volcar los datos a nuestra base de datos
def volcado_datos():

    # Llamamos a la lista que creamos en el archivo anterior
    lista_ropa = ws.web_scraping()

    # Creamos una variable que sea la función que creamos antes para conectar con la base de datos
    conexion = conectar_bbdd()

    # Ejecutamos la conexión con la base de datos
    cursor = conexion.cursor()

    # Creamos un script para que inserte lo que hemos en la base de datos
    script_insercion = 'insert into ropa (nombre, foto, tipo_prenda, temporada, precio) values(%s,%s,%s,%s,%s)'

    # Creamos un bucle para que vaya recorriendo toda la lista con los diccionarios y los vaya insertando en la base de datos
    for ropa in lista_ropa:
        cursor.execute(script_insercion, (ropa['Nombre'], ropa['Foto'], ropa['Tipo_prenda'], ropa['Temporada'], ropa['Precio']))

    # Cerramos la conexión con la base de datos
    conexion.close()

# Función para consultar los datos a la base de datos
def consultar_datos():

    # Conectamos con la base de datos
    conexión = conectar_bbdd()

    # Ejecutamos la conexión con la base de datos
    cursor = conexión.cursor(dictionary=True)

    # Creamos una lista vacía
    lista_ropa = []

    #Hacemos el script de consulta
    script_consulta = "select * from ropa"

    # Ejecutamos la consulta
    cursor.execute(script_consulta)

    # Hacemos una variable en la que se guarden los datos
    lista_ropa = cursor.fetchall()

    # Cerramos la conexión
    conexión.close()

    # Devolvemos la lista de ropa
    return lista_ropa

# Función para eliminar de la base de datos
def eliminar(id):

    # Conectamos con la base de datos
    conexion = conectar_bbdd()

    # Ejecutamos la conexión con la base de datos
    cursor = conexion.cursor()

    # Creamos el script para eliminar de la base de datos
    script_eliminar = "delete from ropa where id = %s"

    # Ejecutamos la orden de eliminar
    cursor.execute(script_eliminar, (id,))

    # Cerramos la conexión
    conexion.close()

# Función para volcar los datos a nuestra base de datos
def insertar_datos(ropa):

    # Llamamos a la lista que creamos en el archivo anterior
    lista_ropa = ws.web_scraping()

    # Creamos una variable que sea la función que creamos antes para conectar con la base de datos
    conexion = conectar_bbdd()

    # Ejecutamos la conexión con la base de datos
    cursor = conexion.cursor()

    # Creamos un script para que inserte lo que hemos en la base de datos
    script_insercion = 'insert into ropa (nombre, foto, tipo_prenda, temporada, precio) values(%s,%s,%s,%s,%s)'

    # Creamos desde la conexión de la base datos para ir añadiendo en el orden los datos que queramos añadirle
    cursor.execute(script_insercion, (ropa['Nombre'], ropa['Foto'], ropa['Tipo_prenda'], ropa['Temporada'], ropa['Precio']))

    # Cerramos la conexión con la base de datos

    conexion.close()

def actualizar_datos(id_prenda, nuevos_datos):
    conexion = conectar_bbdd()
    cursor = conexion.cursor()

    try:
        query:"""
        UPDATE ropa
        SET nombre = %s, foto = %s, tipo_prenda = %s, temporada = %s, precio = %s
        WHERE id = %s
        """

        valores = (
            nuevos_datos['Nombre'],
            nuevos_datos['Foto'],
            nuevos_datos['Tipo_prenda'],
            nuevos_datos['Temporada'],
            nuevos_datos['Precio'],
            id_prenda
        )

        cursor.execute(query, valores)

        conexion.commit()

    except Exception as e:
        conexion.rollback()

    finally:
        conexion.close()