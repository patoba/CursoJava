public class Main{
    public static void main(String[] args) {
        Persona persona = new Persona(); // hacer un ejemplo sin instanciar
        persona.nombre = "Patricio";
        persona.altura = 1.7;
        persona.masa = 70;
        persona.genero = true;

        persona.camina();
        persona.habla("Hola");

        System.out.println(persona.masa);


        //Tambien es valido
        Persona per;
        per = new Persona("Patricio", 1.7, 70, true);

        //Como instanciar
        Persona p = new Persona("Patricio", 1.7, 70, true);
        
        
        Persona p1  = new Persona("Patricio", 1.7, 70, true);
        Persona p2 = new Persona("Patricio", 1.7, 70, true);

        // Metodo toString
        System.out.println(persona);  // Direccion de memoria

        //comparacion
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        // Sobrescribir 
        Persona p3 = p1;
        p3.nombre = "Pedro";
        System.out.println(p1);
        System.out.println(p3);
        System.out.println(p3 == p1);
        

    }
}