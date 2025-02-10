package org.example.UTILIDADES;

import org.example.MODELOS.Personaje;

import javax.swing.plaf.synth.Region;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UtilidadesPersonaje {
    public Personaje levelUp (Personaje personaje){
        Personaje personaje1 = new Personaje();
        Double ataqueBase = personaje1.getAtaqueBase();
        Double defensaBase = personaje1.getDefensaBase();
        Double vidaBase = personaje1.getVidaBase();
        Double manaBase = personaje1.getManaBase();

        ataqueBase = ataqueBase + personaje1.getEscalabilidad().getIncrementoDanyoNivel() * 1;
        personaje1.setAtaqueBase(ataqueBase);
        defensaBase = defensaBase + personaje1.getEscalabilidad().getIncrementoDefensaNivel() * 1;
        personaje1.setDefensaBase(defensaBase);
        vidaBase = vidaBase + personaje1.getEscalabilidad().getIncrementoSaludNivel() * 1;
        personaje1.setVidaBase(vidaBase);
        manaBase = manaBase + personaje1.getEscalabilidad().getIncrementoManaNivel() * 1;
        personaje1.setManaBase(manaBase);

        return personaje1;
    }

    public Map<Region, List<Personaje>> getPersonajesPorRegion(List<Personaje> personajes){
        Map<Region, List<Personaje>> personajesMap = new HashMap<>();

        for (Personaje personaje : personajes) {
            if (!personajesMap.containsKey(personaje.getRegion())) {
                personajesMap.put(personaje.getRegion(), new ArrayList<>(List.of(personaje)));
            } else {
                personajesMap.get(personaje.getRegion()).add(personaje);
            }
        }
        return personajesMap;
    }

    public Personaje getMasPoderoso(List<Personaje> personaje){
        for (Personaje personaje1 : personaje){

        }
    }

    public Map<Region, List<Personaje>> getMasPoderosoPorRegion(List<Personaje> personajes){
        Map<Region, List<Personaje>> personajesMap = new HashMap<>();
        for (Personaje personaje : personajes) {
            if (!personajesMap.containsKey(personaje.getRegion())) {
                personajesMap.put(personaje.getRegion(), new ArrayList<>(List.of(personaje)));
            } else {
                personajesMap.get(personaje.getRegion()).add(personaje);
            }
        }
        return personajesMap;
    }


}
