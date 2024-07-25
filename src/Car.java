public class Car {

    /*        Tu tarea es crear una clase en Java llamada "Car" (Coche en inglés). Esta clase debe tener tres atributos:
        brand (marca), model (modelo) y year (año). Además, debe tener métodos para obtener (getters) y modificar (setters) estos atributos.
        Instrucciones

        La clase debe llamarse "Car".La clase debe tener tres atributos privados:
        String brand
        String model
        int year
        Debes crear métodos "getters" y "setters" para cada uno de los atributos.
        Debes crear un constructor que inicialice los tres atributos.*/

    private String brand = "";
    private String model = "";
    private int year = 0;
    public Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
