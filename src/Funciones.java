public class Funciones {
    public static void main(String[] args) {
        int operador1 = 10;
        int operador2 = 5;
        System.out.println("Resultado de la funcion sumar: ");
        System.out.println(sumar(operador1,operador2));
        System.out.println("\n");

        int n = 8;
        System.out.println("Resultado de la funcion factorial: ");
        System.out.println(factorial(n));
        System.out.println("\n");

        String nombre = "Pedro";
        System.out.println("Resultado de la funcion saludoPersonalizado: ");
        System.out.println(saludoPersonalizado(nombre));
        System.out.println("\n");

        int numero = 5;
        System.out.println("Resultado de la funcion esPar: ");
        System.out.println(esPar(numero));
        System.out.println("\n");

    }

//    Crea una función llamada sumar que tome dos números enteros como argumentos y retorne su suma.
    public static int sumar(int operador1, int operador2){
        return operador1 + operador2;
    }
//    Crea una función llamada factorial que tome un número entero como argumento y retorne su factorial.
public static int factorial(int n) {
    if (n < 0) {
        throw new IllegalArgumentException("El número debe ser no negativo.");
    }
    int result = 1;
    for (int i = 1; i <= n; i++) {
        result *= i;
    }
    return result;
}
//    Crea una función llamada saludoPersonalizado que tome un String como argumento y retorne un saludo personalizado.
    public static String saludoPersonalizado(String nombre){
        return "Buenos días "+nombre;
    }
//    Crea una función llamada esPar que tome un número entero como argumento y retorne true si el número es par y false si no lo es.
    public static boolean esPar(int numero){
        if(numero%2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
