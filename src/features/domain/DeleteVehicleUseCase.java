package features.domain;

public class DeleteVehicleUseCase {

    private static VehicleRepository vehicleRepository;

    public DeleteVehicleUseCase(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public void execute(String id) {
        vehicleRepository.deleteVehicleUseCase(id);
    }
}
