listin = {"juan":123456789, "pedro":987654321}
def elimina(listin,usuario):
    del listin[usuario]
    return listin
print(elimina(listin, "pedro"))