public class Trabajador{
    static int sueldo;
    String nombre;
    

    static int numTrabajadores = 0; // Agragar despues

    Trabajador(int sueldo, String nombre){
        Trabajador.sueldo = sueldo;
        this.nombre = nombre;
        Trabajador.numTrabajadores += 1;
    }

    public static int aumentarUnTrabajador(){  // Agregar despues
        return Trabajador.numTrabajadores += 1;
    }
}