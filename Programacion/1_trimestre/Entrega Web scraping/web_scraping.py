#Importar funciones para el proyecto
import requests
from bs4 import BeautifulSoup

def primera_respuesta_url():
    #Guardar la enlace de la página web en una variable
    url = "https://shop.realbetisbalompie.es/collections/equipaciones"

    #Pedir solicitud para comprobar a la página web (tiene que dar un 200)
    response = requests.get(url).content
    return response

def transformar_sopa():
    response = primera_respuesta_url()

    #Transformar el contenido de la página web
    soup = BeautifulSoup(response, 'html.parser')
    return soup

def web_scraping():
    soup = transformar_sopa()

    # Acceder a los contenedores necesarios de la página web
    news_headlines = soup.find_all('li', class_='column')

    #Plantilla del diccionario
    ropa = {
        "Nombre": "",
        "Foto": "",
        "Tipo_prenda": "",
        "Temporada": "",
        "Precio": "",
    }

    #Copia de diccionario para guardar todos los nuevos que vamos a crear
    ropa_2 = ropa.copy()

    #Creación de una lista para guardar los diferentes diccionarios
    lista_ropa = []

    #Bucle para acceder a distintas cosas de la página web
    for headline in news_headlines:

        #Nombre
        nombre_producto = headline.find('a')['title']
        ropa_2['Nombre'] = nombre_producto

        #Foto
        foto = headline.find('img')['data-src']
        ropa_2['Foto'] = foto

        #Tipo prenda
        tipo_prenda = nombre_producto.split()[0]
        ropa_2['Tipo_prenda'] = tipo_prenda

        #Temporada
        temporada = nombre_producto.split()[-1]
        ropa_2['Temporada'] = temporada

        #Precio
        precio = float(headline.find('span' , class_='amount').text.replace("€", "").replace(",", "."))
        ropa_2['Precio'] = precio

        #Guardar todos los diccionarios en una lista
        lista_ropa.append(ropa_2)
    return lista_ropa

print(web_scraping())