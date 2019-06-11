class Main{

    // Ejercicios Estructura Condicionales

    static boolean divisible(int num1, int num2){
        return num1 % num2 == 0;
    }

    static boolean numPar(int num){
        return num % 2 == 0;
    }

    static double abs(double num){
        if(num < 0)
            return -num;
        return num;
        //return num < 0 ? - num : num;
    }

    static double max(double a, double b){
        return a > b ? a : b;
    }

    // Ejercicios
    
    // Dejar tablas de verdad

    /*
        Un año es biciestr si y solo si es divisible entre 4 y no divisible entre 100, o si es divisible entre 400.
    */
    static boolean biciesto(int anio){
        boolean p = anio % 4 == 0;
        boolean q = anio % 100 == 0;
        boolean r = anio % 400 == 0;
        return p && !q || r;   
    }

    static int operacion(int num1, int num2, char operador){
        if(operador == '+')
            return num1 + num2;
        if(operador == '-')
            return num1 - num2;
        if(operador == '*')
            return num1 * num2;
        if(operador == '%')
            return num1 % num2;
        return 0;
    }

    /*
        Peso en kg
        Altura en m
    */
    static void imc(double peso, double altura){
        double imc = peso / (altura * altura);
        if(imc < 18.5)
            System.out.println("La persona tiene bajo peso");
        else if(imc < 24.99)
            System.out.println("La persona tiene peso normal");
        else if(imc < 30)
            System.out.println("La persona es pre-obesa");
        else
            System.out.println("La persona tiene obesidad");
    }
}