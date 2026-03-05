package features.domain;

public class DeleteVehicleUseCase {

    private VehicleRepository vehicleRepository;

    public DeleteVehicleUseCase(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public static void execute(int id) {
        DeleteVehicleUseCase.execute(id);
    }
}
