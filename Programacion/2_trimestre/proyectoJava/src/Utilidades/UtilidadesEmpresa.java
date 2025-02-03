package Utilidades;

import Modelos.*;

import java.util.*;

public class UtilidadesEmpresa {

    public List <Empleado> getEmpleadosPorContrato(Empresa empresa, TipoContrato tipoContrato) {
        List <Empleado> empleados = new ArrayList<Empleado>();
        for (Empleado empleado : empresa.getEmpleados()) {
            if (empleado.getContrato().getTipoContrato().equals(tipoContrato)) {
                empleados.add(empleado);
            }
        }
        return empleados;
    }

    public List<Empleado> getMileuristasOrdenadosPorSalario(Empresa empresa){
        List <Empleado> empleados = new ArrayList<Empleado>();
        for (Empleado empleado : empresa.getEmpleados()){
            if (empleado.getContrato().getSalarioBase() >= 1000){
                empleados.add(empleado);
            }
        }
        empleados.sort(Comparator.comparing(c-> c.getContrato().getSalarioBase()));
        empleados.reversed();
        return empleados;
    }

    public Double fondoSalarialEmpresa(Empresa empresa){
        Double sumaPrecio = 0.0;
        for (Empleado empleado : empresa.getEmpleados()){

            Double salario = empleado.getContrato().getSalarioBase();
            sumaPrecio += salario;

        }
        return sumaPrecio;
    }

    public Empleado getMejorPagado(List<Empresa> empresas){
        List <Empleado> empleados = new ArrayList<Empleado>();
        for (Empresa empresa : empresas){
            for (Empleado empleado : empresa.getEmpleados()){
                empleados.add(empleado);
            }
        }
        empleados.sort(Comparator.comparing(c-> c.getContrato().getSalarioBase()));
        empleados.reversed();
        return empleados.get(0);
    }

    public Map<tipoEmpresa, Integer> getNumEmpresasPorTipo(List<Empresa> empresas){
        Map<tipoEmpresa, Integer> numEmpresasPorTipo= new HashMap<>();
        for (Empresa empresa : empresas){
            if (!numEmpresasPorTipo.containsKey(empresa.getTipoEmpresa())){
                numEmpresasPorTipo.put(empresa.getTipoEmpresa(), 1);
            } else {
                numEmpresasPorTipo.put(empresa.getTipoEmpresa(), numEmpresasPorTipo.get(empresa.getTipoEmpresa()) + 1);
            }
        }
        return numEmpresasPorTipo;
    }

    public Map<tipoEmpresa,Integer> getNumEmpleadosPorTipoEmpresa(List<Empresa> empresa){
        Map<tipoEmpresa, Integer> numEmpleadosPorTipo= new HashMap<>();
        for (Empresa emp : empresa){
            if (!numEmpleadosPorTipo.containsKey(emp.getTipoEmpresa())){
                numEmpleadosPorTipo.put(emp.getTipoEmpresa(), emp.getEmpleados().size());
            } else {
                numEmpleadosPorTipo.put(emp.getTipoEmpresa(), numEmpleadosPorTipo.get(emp.getTipoEmpresa()) + emp.getEmpleados().size());
            }
        }
        return numEmpleadosPorTipo;
    }

    public Map<TipoContrato, List<Empleado>> getEmpleadosPorTipoContrato(Empresa empresas){
        Map<TipoContrato, List<Empleado>> empleadosPorTipoContrato= new HashMap<>();
        for (Empleado empleado : empresas.getEmpleados()){
            if (!empleadosPorTipoContrato.containsKey(empleado.getContrato().getTipoContrato())){
                empleadosPorTipoContrato.put(empleado.getContrato().getTipoContrato(), new ArrayList<>(List.of(empleado)));
            } else {
                empleadosPorTipoContrato.get(empleado.getContrato().getTipoContrato()).add(empleado);
            }
        }
        return empleadosPorTipoContrato;
    }

    public Map<Empresa, Map<TipoContrato, List<Empleado>>> getEmpleadosPorTipoContrato(List<Empresa> empresas){
        Map<Empresa, Map<TipoContrato, List<Empleado>>> empleadosPorTipoContrato= new HashMap<>();
        for (Empresa empresa : empresas){
            empleadosPorTipoContrato.put(empresa, getEmpleadosPorTipoContrato(empresa));
        }
        return empleadosPorTipoContrato;
    }

}
