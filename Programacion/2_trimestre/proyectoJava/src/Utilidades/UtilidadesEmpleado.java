package Utilidades;

import Modelos.Empleado;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UtilidadesEmpleado {
    public Map<String, List<Empleado>> getEmpleadosPorLetraDNI(List<Empleado> empleados){
        Map<String, List<Empleado>> empleadosPorLetraDNI = new HashMap<>();
        for(Empleado empleado : empleados){
            if(!empleadosPorLetraDNI.containsKey("A-Z")){
                String dni = empleado.getDni();
                empleadosPorLetraDNI
            }
        }
    }
}
