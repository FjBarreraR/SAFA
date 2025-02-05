package Utilidades;

import Modelos.Contrato;
import Modelos.Empleado;
import Modelos.Empresa;
import Modelos.TipoContrato;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UtilidadesContrato {
    public Map<TipoContrato, Double> getSalarioMedioTipoContrato(List<Contrato> contratos){
        Map<TipoContrato, Double> salarioTotalTipoContrato = new HashMap<>();
        Map<TipoContrato, Integer> numTotalEmpleados = new HashMap<>();
        Map<TipoContrato, Double> finale = new HashMap<>();
        for(Contrato c : contratos){
            if (!salarioTotalTipoContrato.containsKey(c.getTipoContrato())){
                salarioTotalTipoContrato.put(c.getTipoContrato(), c.getSalarioBase());
            }else {
                salarioTotalTipoContrato.put(c.getTipoContrato(), c.getSalarioBase() + c.getSalarioBase());
            }
        }

        for (Contrato c : contratos){
            if (!numTotalEmpleados.containsKey(c.getTipoContrato())){
                numTotalEmpleados.put(c.getTipoContrato(), 1);
            } else {
                numTotalEmpleados.put(c.getTipoContrato(), numTotalEmpleados.get(c.getTipoContrato()) + 1);
            }
        }

        for (TipoContrato tc : salarioTotalTipoContrato.keySet()){
            finale.put(tc, salarioTotalTipoContrato.get(tc)/numTotalEmpleados.get(tc));
        }
        return finale;
    }


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
        for (Contrato cont : contratos) {
            //MAPA VACIO
            if(!ListContratosPorTipo.containsKey(cont.getTipoContrato())) {
                ListContratosPorTipo.put(cont.getTipoContrato(), new ArrayList<>(List.of(cont)));
            }else{
                ListContratosPorTipo.get(cont.getTipoContrato()).add(cont);
            }
        }
        return ListContratosPorTipo;
    }

    public Empleado contratarTrabajador(Empresa e, String dni, String nombre, String apellidos, String direccion, String telefono, TipoContrato tipo, Double salario){
        Empleado emp = new Empleado();
        Contrato contrato = new Contrato();
        emp.setDni(dni);
        emp.setNombre(nombre);
        emp.setApellido(apellidos);
        emp.setDireccion(direccion);
        emp.setEmpresa(e);
        emp.setNumTelefono(telefono);
        emp.();
    }
}
