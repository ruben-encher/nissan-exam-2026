package features.data;

import features.domain.VehicleRepository;


public class Vehicle implements VehicleRepository {
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

    public Vehicle(VehicleMemLocalDataSource vehicleMemLocalDataSource) {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void saveVehicleUseCase(Vehicle vehicle) {

    }

    @Override
    public void deleteVehicleUseCase(String id) {
        deleteVehicleUseCase(id);
    }

}
