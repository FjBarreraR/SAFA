base = int(input("Introduce la base imponible de la factura: "))
def aplica_iva(base):
    iva = 21
    base = ((base * iva) / 100) + base
    return base
print(aplica_iva(base))
