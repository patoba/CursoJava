public class Fecha{
    int dia;
    int mes;
    int anio;

    Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public String toString(){
        return dia + "/" + mes + "/" + anio;
    }
}