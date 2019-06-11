public class PruebaStatic{
    //Hacer una clase persona explicar ventajas de usar constructor
    // memoria, metodo toString, equals
    // dejar un ejercicio para que hagan un uml y su clase
    public static void main(String[] args) {
        Trabajador t1 = new Trabajador(100, "Pablo");
        Trabajador t2 = new Trabajador(200, "Raul");
        System.out.println(t1.sueldo);
        System.out.println(t2.sueldo);
        System.out.println("");
        t1.sueldo = 10;
        System.out.println(t1.sueldo);
        System.out.println(t2.sueldo);
        
    }
}