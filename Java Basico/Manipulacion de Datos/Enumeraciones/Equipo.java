public enum Equipo{
    //lugar, nombre, pg, pe, pp, pts
    BARCELONA(1, "FC. Barcelona", 37),
    ATLETICO_MADRID(2, "Atletico del Madrid", 34),
    SEVILLA(3, "Sevilla", 32),
    ALAVES(4, "Alaves", 31),
    REAL_MADRID(5, "Real Madrid", 30);

    private byte posicion;
    private String nombre;
    private byte puntos;

    private  Equipo(byte posicion, String nombre, byte puntos){
        this.posicion = posicion;
        this.nombre = nombre;
        this.puntos = puntos;
    }

    public byte getPosicion(){
        return this.posicion;
    }

    public String nombre(){
        return this.nombre;
    }

    public byte puntos(){
        return this.puntos;
    }
}