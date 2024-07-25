package herenciaClases;

public class Vehicle {
//    Tu tarea es crear una clase base en Java llamada "Vehicle" (Vehículo en inglés) y una clase derivada llamada "Car" (Coche en inglés).
//    La clase base "Vehicle" debe tener tres atributos: brand (marca), speed (velocidad) y type (tipo).
//    La clase "Car" debe heredar estos atributos y añadir uno más: model (modelo). Ambas clases deben tener métodos
//    para obtener (getters) y modificar (setters) sus respectivos atributos.
    private String brand = "";
    private int speed = 0;
    private String type = "";

    public Vehicle (String brand, int speed, String type){
        this.brand = brand;
        this.speed = speed;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
