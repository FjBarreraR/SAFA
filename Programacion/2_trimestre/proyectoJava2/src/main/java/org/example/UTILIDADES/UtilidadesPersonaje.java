package org.example.UTILIDADES;

import org.example.MODELOS.Personaje;
import org.example.MODELOS.Region;


import java.util.*;

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

    public Personaje levelUp18 (Personaje personaje){
        Personaje personaje1 = new Personaje();
        Double ataqueBase = personaje1.getAtaqueBase();
        Double defensaBase = personaje1.getDefensaBase();
        Double vidaBase = personaje1.getVidaBase();
        Double manaBase = personaje1.getManaBase();

        ataqueBase = ataqueBase + personaje1.getEscalabilidad().getIncrementoDanyoNivel() * 18;
        personaje1.setAtaqueBase(ataqueBase);
        defensaBase = defensaBase + personaje1.getEscalabilidad().getIncrementoDefensaNivel() * 18;
        personaje1.setDefensaBase(defensaBase);
        vidaBase = vidaBase + personaje1.getEscalabilidad().getIncrementoSaludNivel() * 18;
        personaje1.setVidaBase(vidaBase);
        manaBase = manaBase + personaje1.getEscalabilidad().getIncrementoManaNivel() * 18;
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
        List<Personaje> personajeMasPoderoso = new ArrayList<>();
        for (Personaje personaje1 : personaje){
            levelUp18(personaje1);
            personajeMasPoderoso.add(personaje1);
        }
        personajeMasPoderoso.sort(Comparator.comparing(p -> p.getAtaque()+ p.getDefensa()+ p.getMana()+ p.getVida()));
        return personajeMasPoderoso.get(0);
    }

    public Map<Region, Personaje> getMasPoderosoPorRegion(List<Personaje> personajes){
        Map<Region, List<Personaje>> nombre = getPersonajesPorRegion(personajes);
        Map<Region, Personaje> personajesMap = new HashMap<>();
        for (Region p : nombre.keySet()) {
            Personaje personaje = getMasPoderoso(nombre.get(p));
            personajesMap.put(p, personaje);
        }
        return personajesMap;
    }
}
