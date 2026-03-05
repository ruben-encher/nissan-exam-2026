import features.domain.SaveVehicleUseCase;
import features.presentation.VehicleView;


public class Main {
    public static void main(String[] args) {

        // Función 1
        VehicleView.printVehicles();
        VehicleView.SaveVehicleUseCase();
        VehicleView.printVehicles();

        // Función 2
        VehicleView.printVehicles();

        // Función 3
        VehicleView.printVehicles();
        VehicleView.DeleteVehicleUseCase();
        VehicleView.printVehicles();

    }
}