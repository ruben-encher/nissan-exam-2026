package features.domain;

import features.data.Vehicle;

import java.util.ArrayList;

public interface VehicleRepository {

    ArrayList<Vehicle> storage = new ArrayList<>();

    public void saveVehicleUseCase(Vehicle vehicle);

    public void deleteVehicleUseCase(String id);
}
