package features.domain;

import features.data.Vehicle;

public class SaveVehicleUseCase {

    private static VehicleRepository vehicleRepository;

    public SaveVehicleUseCase(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public void execute(Vehicle vehicle) {
        vehicleRepository.saveVehicleUseCase(vehicle);
    }
}
