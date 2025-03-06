package com.sl.utilidades;

import com.sl.modelos.*;

import java.util.*;
import java.util.stream.Collectors;

public class UtilidadesGeografia {



    public static List<Pais> ejercicio1(List<Pais> paises) {
        List<Pais> paisesFinal = new ArrayList<>();

        for (Pais p : paises){
            if (p.getPaisesVecinos().size() >= 1 && p.getComunidadesAutonomas().size()>2){
                paisesFinal.add(p);
            }
        }
        return paisesFinal;
    }


    public static Map<Continente, Integer> ejercicio2(List<Continente> continentes) {
        Map<Continente, Integer> mapaFinal = new HashMap<>();

        for (Continente c : continentes){
            if (!mapaFinal.containsKey(c)){
                mapaFinal.put(c, c.getPaises().size());
            }
        }
        return mapaFinal;
    }


    public List<Ciudad> ejercicio3(List<Ciudad> ciudades, List<Pais> paises) {
        Set<Ciudad> listaFinal = new HashSet<>();

        for (Ciudad c : ciudades){
            for (Pais p : paises){
                if (p.getCapital().equals(c)){
                    listaFinal.add(c);
                }
            }
        }



        return new ArrayList<>(listaFinal);
    }



    public static Map<Pais, Long> ejercicio4(List<Pais> paises) {
        Map<Pais, Long> mapaFinal = new HashMap<>();


        for (Pais p : paises){
            if (!mapaFinal.containsKey(p)){
                List<ComunidadAutonoma> ca= p.getComunidadesAutonomas();
                Long poblacion = 0L;
                for (ComunidadAutonoma cA : ca){
                    for (Ciudad c : cA.getCiudades()){
                        poblacion += c.getPoblacion();
                    }
                }
                mapaFinal.put(p, poblacion);
            }
        }

        return mapaFinal;
    }

    public static Long auxEje5 (Pais pais){
        Long poblacion = 0L;
        List<ComunidadAutonoma> ca = pais.getComunidadesAutonomas();

        for (ComunidadAutonoma cA : ca){
            for (Ciudad c : cA.getCiudades()){
                poblacion += c.getPoblacion();
            }
        }

        return poblacion;
    }

    public static boolean ejercicio5(InformePais informePais, Pais pais) {
        boolean fin = false;
        Long pobPais = auxEje5(pais);
        Integer ciudades = 0;

        for (ComunidadAutonoma ca : pais.getComunidadesAutonomas()){
            ciudades += ca.getCiudades().size();
        }

        if (pais.equals(informePais.getPais()) && informePais.getTotalHabitantesPais().equals(pobPais) && informePais.getTotalComunidadesAutonomasPais().equals(pais.getComunidadesAutonomas().size()) && informePais.getTotalCiudadesPais().equals(ciudades)){
            fin = true;
        }

        return fin;
    }

    public static ComunidadAutonoma auxEje6Ext (List<ComunidadAutonoma> comunidades){
        ComunidadAutonoma ca = null;
        Long extMax = 0L;

        for (ComunidadAutonoma cA : comunidades){
            Long ext = 0L;
            for (Ciudad c : cA.getCiudades()){
                ext += c.getExtension();
            }
            if (extMax < ext){
                extMax = ext;
                ca = cA;
            }
        }

        return ca;
    }

    public static ComunidadAutonoma auxEje6Pob (List<ComunidadAutonoma> comunidades){
        ComunidadAutonoma ca2 = null;
        Long extMax = 0L;

        for (ComunidadAutonoma cA : comunidades){
            Long ext = 0L;
            for (Ciudad c : cA.getCiudades()){
                ext += c.getPoblacion();
            }
            if (extMax < ext){
                extMax = ext;
                ca2 = cA;
            }
        }

        return ca2;
    }

    public static ComunidadAutonoma auxEje6ComCap(List<ComunidadAutonoma> comunidades, Pais pais){
        ComunidadAutonoma ca = null;

        for (ComunidadAutonoma ca2 : comunidades){
            if (ca2.getCiudades().equals(pais.getCapital())){
                ca = ca2;
            }
        }

        return ca;
    }

    public static InformeDetalladoPais ejercicio6(Pais pais) {
        InformeDetalladoPais idp = new InformeDetalladoPais();

        Map<ComunidadAutonoma, Long> exCE = new HashMap<>();
        for (ComunidadAutonoma ca : pais.getComunidadesAutonomas()){
            Long ext = 0L;
            for (Ciudad c : ca.getCiudades()){
                ext += c.getExtension();
            }
            exCE.put(ca, ext);
        }
        idp.setExtensionComunidades(exCE);

        Map<ComunidadAutonoma, Long> exCP = new HashMap<>();
        for (ComunidadAutonoma ca : pais.getComunidadesAutonomas()){
            Long pob = 0L;
            for (Ciudad c : ca.getCiudades()){
                pob += c.getPoblacion();
            }
            exCE.put(ca, pob);
        }
        idp.setExtensionComunidades(exCP);

        idp.setComunidadMasGrande(auxEje6Ext(pais.getComunidadesAutonomas()));
        idp.setComunidadMasPoblada(auxEje6Pob(pais.getComunidadesAutonomas()));
        idp.setComunidadDeLaCapital(auxEje6ComCap(pais.getComunidadesAutonomas(), pais));

        return idp;
    }


}
