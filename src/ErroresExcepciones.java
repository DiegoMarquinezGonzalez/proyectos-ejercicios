import java.io.FileReader;
import java.io.IOException;

public class ErroresExcepciones {
    public static void main(String[] args) {
        //para forzar y probar que lanza la excepcion dividir()
        int num1 = 10;
        int num2 = 0;
        try{
            dividir(num1, num2);
        }catch (ArithmeticException e){
            System.err.println(e.getMessage());
        }

        //para forzar y probar que lanza la excepcion leerArchivo()
        String nombreArchivo = "archivo_inexistente";
        try {
            leerArchivo(nombreArchivo);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        //para forzar y probar que lanza la excepcion mostrarLongitud()
        String cadena = null;
        try{
            mostrarLongitud(cadena);
        }catch(NullPointerException e){
            System.err.println(e.getMessage());
        }

        //para forzar y probar que lanza la excepcion lanzarExcepcionPersonalizada()
        int num = -5;
        try{
            lanzarExcepcionPersonalizada(num);
        }catch(ExcepcionPersonalizada e){
            System.err.println(e.getMessage());
        }


    }
    //Crea una función llamada dividir que tome dos números enteros como argumentos. La función debe realizar una división del primer número entre el segundo. Lanza una excepción de tipo ArithmeticException si el divisor es cero.
    public static int dividir(int num1, int num2) throws ArithmeticException{
        try{
            return num1/num2;
        }catch(ArithmeticException e){
            throw new ArithmeticException("No se puede dividir por cero");
        }
    }
    //Implementa una función llamada leerArchivo que intente abrir un archivo de texto. Usa la clase FileReader o Files.readAllLines(). Lanza y maneja una excepción de tipo IOException si el archivo no se puede abrir.
    public static void leerArchivo(String nombreArchivo) throws IOException{
        try {
            FileReader reader = new FileReader(nombreArchivo);
        } catch (IOException e) {
            throw new IOException("El archivo no se puede abrir");
        }
    }

    //Crea una función llamada mostrarLongitud que tome un String como argumento y muestre la longitud de la cadena. Lanza y maneja una excepción de tipo NullPointerException si el argumento es nulo.
    public static int mostrarLongitud(String cadena) throws NullPointerException{
        try{
           return cadena.length();
        }catch(NullPointerException e){
            throw new NullPointerException("La cadena no puede ser nula");
        }
    }

    //Crea una excepción personalizada llamada ExcepcionPersonalizada. Lanza esta excepción en una función llamada lanzarExcepcionPersonalizada si se cumple una cierta condición de tu elección.
    public static void lanzarExcepcionPersonalizada(int num) throws ExcepcionPersonalizada{
        if(num < 0){
            throw new ExcepcionPersonalizada("El numero no puede ser negativo");
        }
        System.out.println("El número es positivo");
    }

}
