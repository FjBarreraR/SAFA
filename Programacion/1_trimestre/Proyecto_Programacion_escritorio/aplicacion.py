# Bibliotecas
import sys
from PyQt5.QtWidgets import *
from PyQt5 import uic
from almacenamiento_datos import *

# Creamos una clase
class MiVentana(QMainWindow):
    #Creamos la primera función
    def __init__(self):
        super().__init__()
        uic.loadUi('ropa_betis.ui', self)

    # Conectar los botones del menú
        self.ver_base_datos.clicked.connect(self.cargar_datos_tabla)
        self.registrar.clicked.connect(lambda: self.stackedWidget.setCurrentWidget(self.registrar_page))
        self.actualizar.clicked.connect(lambda: self.stackedWidget.setCurrentWidget(self.actualizar_page))
        self.eliminar.clicked.connect(lambda: self.stackedWidget.setCurrentWidget(self.eliminar_page))

    # Conectar botón de aceptar
        self.bot_aceptar.clicked.connect(self.crear_nueva_prenda)
        self.bot_eliminar.clicked.connect(self.eliminar_prenda)
        self.bot_buscar.clicked.connect(self.buscar_id_prenda)
        self.bot_actu.clicked.connect(self.actualizar_prenda)

    # Cargar los datos de la base de datos a la aplicación
    def cargar_datos_tabla(self):
        self.stackedWidget.setCurrentWidget(self.base_de_datos)
        ropa = consultar_datos()
        self.tabla_base_datos.setRowCount(len(ropa))

        for fila, ropa in enumerate(ropa, start=0):
            for columna, campo_ropa in enumerate(ropa.values(), start=0):
                self.tabla_base_datos.setItem(fila, columna, QTableWidgetItem(str(campo_ropa)))
        self.tabla_base_datos.resizeColumnsToContents()

    # Crear nuevos registros en la base de datos
    def crear_nueva_prenda(self):
        nueva_prenda = dict()
        nueva_prenda['Nombre'] = self.input_nombre.text()
        self.input_nombre.setText("")
        nueva_prenda['Foto'] = self.input_foto.text()
        self.input_foto.setText("")
        nueva_prenda['Tipo_prenda'] = self.input_tipodeprenda.text()
        self.input_tipodeprenda.setText("")
        nueva_prenda['Temporada'] = self.input_temporada.text()
        self.input_temporada.setText("")
        nueva_prenda['Precio'] = float(self.input_precio.text())
        self.input_precio.setText("")
        insertar_datos(nueva_prenda)

    # Eliminar datos de la base de datos
    def eliminar_prenda(self):
        eliminar(self.input_eliminar.text())
        self.input_eliminar.setText("")
        QMessageBox.information(self, "Éxito", "Prenda eliminada con éxito")

    # Buscar por id en la base de datos
    def buscar_id_prenda(self):
        id = self.line_id.text()
        lista_ropa = buscar_id(id)

        self.linea_nombre.setText(lista_ropa[0]['nombre'])
        self.linea_foto.setText(lista_ropa[0]['foto'])
        self.linea_prenda.setText(lista_ropa[0]['tipo_prenda'])
        self.linea_temporada.setText(lista_ropa[0]['temporada'])
        self.linea_precio.setText(str(lista_ropa[0]['precio']))

    # Actualizar la base de datos
    def actualizar_prenda(self):
        id_prenda = int(self.line_id.text())
        nuevos_datos = {
            'nombre': self.linea_nombre.text(),
            'foto': self.linea_foto.text(),
            'tipo_prenda': self.linea_prenda.text(),
            'temporada': self.linea_temporada.text(),
            'precio': float(self.linea_precio.text())
        }

        actualizar_datos(id_prenda, nuevos_datos)
        self.linea_nombre.setText("")
        self.linea_foto.setText("")
        self.linea_prenda.setText("")
        self.linea_precio.setText("")
        self.linea_temporada.setText("")



if __name__ == '__main__':
    app = QApplication(sys.argv)
    ventana = MiVentana()
    ventana.show()
    sys.exit(app.exec_())
