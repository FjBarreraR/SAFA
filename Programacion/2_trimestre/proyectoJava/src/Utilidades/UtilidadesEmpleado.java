package Utilidades;

import Modelos.Empleado;
import Modelos.Empresa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UtilidadesEmpleado {
    public Map<String, List<Empleado>> getEmpleadosPorLetraDNI(List<Empleado> empleados){
        Map<String, List<Empleado>> empleadosPorLetraDNI = new HashMap<>();
        for(Empleado empleado : empleados){
            if(!empleadosPorLetraDNI.containsKey(empleado.getEmpresa())){
                String dni = empleado.getDni().substring(8);
                empleadosPorLetraDNI.put(dni, new ArrayList<>(List.of(empleado)));
            } else {
                empleadosPorLetraDNI.get(empleado.getEmpresa()).add(empleado);
            }
        }
        return empleadosPorLetraDNI;
    }

    public Map<Empresa, List<Empleado>> getEmpleadosPorEmpresa(List<Empleado> empleados){
        Map <Empresa, List<Empleado>> empleadosPorEmpresa = new HashMap<>();
        for(Empleado empleado : empleados){
            if(!empleadosPorEmpresa.containsKey(empleado.getEmpresa())){
                empleadosPorEmpresa.put(empleado.getEmpresa(), new ArrayList<>(List.of(empleado)));
            } else {
                empleadosPorEmpresa.get(empleado.getEmpresa()).add(empleado);
            }
        }
        return empleadosPorEmpresa;
    }

}
