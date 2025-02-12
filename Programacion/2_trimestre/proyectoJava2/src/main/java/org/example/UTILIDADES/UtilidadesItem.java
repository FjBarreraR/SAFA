package org.example.UTILIDADES;

import org.example.MODELOS.Item;
import org.example.MODELOS.Personaje;

import java.util.List;

public class UtilidadesItem {
    public void equiparItem(Personaje personaje, Item item) {
        List<Item> items = personaje.getEquipamiento();
        items.add(item);
        personaje.setEquipamiento(items);

        personaje.setAtaque(item.getAumentoDanyo() + personaje.getAtaque());
        personaje.setDefensa(item.getAumentoDefensa() + personaje.getDefensa());
        personaje.setMana(item.getAumentoMana() + personaje.getMana());
        personaje.setVida(item.getAumentoSalud() + personaje.getVida());
    }

}
