public class PruebaStatic{

    public static void main(String[] args) {
        Fecha f1 = new Fecha(23, 23, 2000);
        Fecha f2 = new Fecha(12, 23, 1999);
        Fecha f3 = new Fecha(05, 23, 2010);

        Trabajador t1 = new Trabajador(100, "Pablo", f1);
        Trabajador t2 = new Trabajador(200, "Raul", f2);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println("");
        
        t1.fechaDeNacimiento = f3;

        System.out.println(t1);
        System.out.println(t2);
        
    }
}