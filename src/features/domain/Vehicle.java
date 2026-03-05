package features.domain;

public class Vehicle {

    private String id;
    private String marca;
    private String model;
    private int capacity;
    private String type;

    public Vehicle(String id, String model, String marca, int capacity, String type) {
        this.id = id;
        this.model = model;
        this.marca = marca;
        this.capacity = capacity;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getModel() {
        return model;
    }

    public String getMarca() {
        return marca;
    }
}
