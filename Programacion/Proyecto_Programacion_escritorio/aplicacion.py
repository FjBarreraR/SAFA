import sys
from PyQt5.QtWidgets import *
from PyQt5 import uic
from almacenamiento_datos import *

class MiVentana(QMainWindow):
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

    def cargar_datos_tabla(self):
        self.stackedWidget.setCurrentWidget(self.base_de_datos)
        ropa = consultar_datos()
        self.tabla_base_datos.setRowCount(len(ropa))

        for fila, ropa in enumerate(ropa, start=0):
            for columna, campo_ropa in enumerate(ropa.values(), start=0):
                self.tabla_base_datos.setItem(fila, columna, QTableWidgetItem(str(campo_ropa)))
        self.tabla_base_datos.resizeColumnsToContents()

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

    def eliminar_prenda(self):
        eliminar(self.input_eliminar.text())
        self.input_eliminar.setText("")



if __name__ == '__main__':
    app = QApplication(sys.argv)
    ventana = MiVentana()
    ventana.show()
    sys.exit(app.exec_())
