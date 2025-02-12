package org.example.UTILIDADES;

import org.example.MODELOS.Habilidad;
import org.example.MODELOS.Item;
import org.example.MODELOS.Personaje;
import org.example.UTILIDADES.*;

public class UtilidadesHabilidad {
    public void golpearConHabilidad(Personaje emisor, Personaje receptor, Habilidad habilidadEmisor){
        UtilidadesPersonaje uP = new UtilidadesPersonaje();
        UtilidadesItem uI = new UtilidadesItem();
        Personaje p1 = uP.levelUp18(emisor);
        Personaje p2 = uP.levelUp18(receptor);

        if (!(emisor.getEquipamiento() == null && emisor.getEquipamiento().isEmpty())){
            for (Item i : emisor.getEquipamiento()){
                uI.equiparItem(emisor, i);
            }
        }

        if (!(receptor.getEquipamiento() == null && receptor.getEquipamiento().isEmpty())){
            for (Item i : receptor.getEquipamiento()){
                uI.equiparItem(emisor, i);
            }
        }

        Double danyoHabilidad = habilidadEmisor.getDanyoBase() + (0.2 * emisor.getAtaque() - (0.1 * receptor.getDefensa()));

        emisor.setMana(emisor.getMana() - habilidadEmisor.getCosteMana());
        receptor.setVida(receptor.getVida() - danyoHabilidad);
    }

}
