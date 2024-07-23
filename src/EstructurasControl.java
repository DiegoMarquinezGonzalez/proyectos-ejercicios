public class EstructurasControl {
    public static void main(String[] args) {

        //    Utiliza una declaración if-else para imprimir "Es positivo" si un número entero n es positivo y "Es negativo" si es negativo.
        int numero = -5;
        if(numero > 0){
            System.out.println("El numero es positivo");
        }else{
            System.out.println("El numero es negativo");
        }
        //Mismo resultado pero con oeprador ternario
        //System.out.println(numero > 0 ? "El numero es positivo" : "El numero es negativo");

        System.out.println("\n");
        //Utiliza un bloque switch para imprimir los días de la semana en función de un número entero d, donde 1 representa el Lunes, 2 el Martes, y así sucesivamente hasta 7 para el Domingo.
        int d = 5;
        switch (d){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }

        System.out.println("\n");
        //Usa un bucle for para imprimir los primeros 10 números pares.
        for(int i = 1; i<= 10; i++){
            System.out.println(i*2);
        }

        System.out.println("\n");
        //Utiliza un bucle while para sumar todos los números enteros de 1 a n y almacenar el resultado en una variable sum.
        int n = 10;
        int num = 1;
        int sum = 0;

        while (num <= n){
            sum +=num;
            num++;
        }
        System.out.println("sum = " + sum);


        System.out.println("\n");
        //Utiliza un bucle do-while para imprimir los primeros n números impares.
        int numImpar = 0;
        int j = 1;
        do{
            if(numImpar%2 != 0){
                System.out.println(numImpar);
                j++;
            }
            numImpar++;
        }while(j <= 10);

    }







}
