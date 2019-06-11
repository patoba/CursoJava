class Persona{

    String nombre;
    double altura;
    double masa;
    boolean genero;  // true masculino false femenino
    
    Persona(String nombre, double altura, double masa, boolean genero){
        this.nombre = nombre;
        this.altura = altura;
        this.masa = masa;
        this.genero = genero;
    }

    Persona(){
        this(null, 0.0, 0.0, false);
    }

    void camina(){
        System.out.println("Estoy caminando");
    }

    void habla(String oracion){
        System.out.println(oracion);
    }

    public String toString(){
        return "Nombre: " + this.nombre + "\n" +
               "Altura: " + this.altura + "\n" +
               "Masa: " + this.masa + "\n" +
               "Genero: " + (this.genero ? "M" : "F");
    }

    public boolean equals(Persona o){  // No es del todo correcta
        return this.nombre.equals(o.nombre)
               && this.altura == o.altura
               && this.masa == o.masa
               && this.genero == o.genero;
    }

    public Persona clone(){
        return new Persona(this.nombre, this.altura, this.masa, this.genero);
    }
}