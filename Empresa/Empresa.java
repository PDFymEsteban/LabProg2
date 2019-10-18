package Empresa;

public class Empresa {

    public static void main(String[] args) {

        UsoEmpleado[] Empleados = new UsoEmpleado[4];
        Empleados[0] = new UsoEmpleado("Juan",40000);
        Empleados[1] = new UsoEmpleado("Matis",40000);
        Empleados[2] = new UsoEmpleado("Anabela",40000);
        Empleados[3] = new UsoEmpleado("Graciela",40000);

        Empleados[4] = new Jefe("Yamil",40000);
        for (UsoEmpleado empleado :Empleados) {
            System.out.println(empleado.getDatos()+"\nSUELDO"+empleado.getSueldo());
        }

    }

}
