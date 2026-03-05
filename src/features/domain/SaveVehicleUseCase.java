package features.domain;

import features.presentation.VehicleView;

public class SaveVehicleUseCase {

    private VehicleRepository vehicleRepository;

    public SaveVehicleUseCase(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public static void execute(Vehicle vehicle) {
        SaveVehicleUseCase.execute(vehicle);
    }
}
