package Utilidades;

import Modelos.Contrato;
import Modelos.TipoContrato;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UtilidadesContrato {
    public Map<TipoContrato, Integer> getNumContratosPorTipo (List<Contrato> contratos) {
        Map<TipoContrato, Integer> NumContratosPorTipo = new HashMap<>();
        for (Contrato cont : contratos) {
            //MAPA VACIO
            if(!NumContratosPorTipo.containsKey(cont.getTipoContrato())) {
                NumContratosPorTipo.put(cont.getTipoContrato(), 1);
            }else{
                NumContratosPorTipo.put(cont.getTipoContrato(), NumContratosPorTipo.get(cont.getTipoContrato()) + 1);
            }
        }
        return NumContratosPorTipo;
    }

    public Map<TipoContrato, List<Contrato>> getListContratosPorTipo (List<Contrato> contratos){
        Map<TipoContrato, List <Contrato>> ListContratosPorTipo = new HashMap<>();
        List <Contrato> contratosLista = new ArrayList<>();
        for (Contrato cont : contratos) {
            //MAPA VACIO
            if(!ListContratosPorTipo.containsKey(cont.getTipoContrato())) {
                ListContratosPorTipo.put(cont.getTipoContrato(), cont.getTipoContrato());
            }else{
                ListContratosPorTipo.put(cont.getTipoContrato(), ListContratosPorTipo.get(cont.getTipoContrato()));
            }
        }
        return ListContratosPorTipo;
    }
}
