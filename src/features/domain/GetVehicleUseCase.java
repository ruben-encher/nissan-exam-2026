package features.domain;

import java.util.ArrayList;

public class GetVehicleUseCase {

    private VehicleRepository vehicleRepository;

    public GetVehicleUseCase(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    ArrayList<Vehicle> storage = new ArrayList<>();
}
