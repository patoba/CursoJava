public class PruebaEnumeraciones{
    public static void main(String[] args) {
        Coordenada posNorte = Coordenada.NORTE; // Instancia de un enum
        Coordenada posSur = Coordenada.SUR;  // Instancia de un enum
        String nombre = posNorte.name();        // String con el nombre de la enum
        int posicion =  posNorte.ordinal();    // Entero con la posicion del enum segun esta declarada
        int comparacion = posNorte.compareTo(posSur); // Compara dos enums
       System.out.println("Nombre "+ nombre);
       System.out.println("Posicion "+posicion);
       System.out.println("Comparacion: "+comparacion);
        for(Coordenada cor : Coordenada.values()){ // Devuelve un arreglo
            System.out.println(cor);
        }
        
    }

}