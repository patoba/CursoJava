public class Trabajador{
    int sueldo;
    String nombre;
    final Fecha fechaDeNacimiento;

    static int numTrabajadores = 0; // Agragar despues

    Trabajador(int sueldo, String nombre, Fecha fechaDeNacimiento){
        this.sueldo = sueldo;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        Trabajador.numTrabajadores += 1;
    }

    public static int aumentarUnTrabajador(){  // Agregar despues
        return Trabajador.numTrabajadores += 1;
    }

    public String toString(){
        return nombre + "\n" + "sueldo: $" +sueldo + "\nFecha de nac: "+ fechaDeNacimiento; 
    }
}