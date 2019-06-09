class Main{

    public static void main(String[] args) {
        System.out.println(pow(7, 2));
    }

    static int factorial(int num){
        if(num <= 1)
            return 1;
        return num * factorial(num - 1);
    }

    static int factorial2(int num){
        int factorial = 1;
        for(int i = 2; i <= num; i++)
            factorial *= i;
        return factorial;
    }

    static void factores(int num){
        for(int i = 1; i <= num; i++)
            if(num % i == 0)
                System.out.print(i + " ");
        System.out.println("");
    }

    // Imprimir todos los factores que sean impares
    // Si se encuentra algun factor multiplo de 11, no mostrar mas factores
    static void factores2(int num){
        for(int i = 1; i <= num; i++){
            if(i % 11 == 0)
                break;
            if(i % 2 == 0)
                continue;
            if(num % i == 0)
                System.out.print(i + " ");
        }
        System.out.println("");
    }

    static int multiplicar(int num1, int num2){
        int mul = 0;
        for(int i = 0; i < num2; i++)
            mul += num1;
        return mul;
    }

    

    static void cuadrado(int renglones, int columnas){
        for(int i = 0; i < renglones; i++){
            for(int j = 0; j < columnas; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    // Ejercicios

    static int pow(int a, int b){
        int mul = 1;
        for(int i = 0; i < b; i++)
            mul *= a;
        return mul;
    }

    static int suma(int num){
        int sum = 0;
        for(int i = 1; i <= num; i++)
            sum += i;
        return sum;
    }
    
    static int mcm(int a, int b){
        int mcmf = 1;
        for(int i = 2; a >= i && b >= i ; i++)
            while(a % i == 0 && b % i == 0){
                mcmf *= i;
                a /= i;
                b /= i;
            }
        return mcmf;
    }


}