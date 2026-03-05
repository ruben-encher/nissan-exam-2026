package features.presentation;

import features.data.Vehicle;
import features.data.VehicleMemLocalDataSource;
import features.domain.DeleteVehicleUseCase;
import features.domain.GetVehicleUseCase;
import features.domain.SaveVehicleUseCase;

import java.util.ArrayList;

public class VehicleView {
    public static void printVehicles() {
        GetVehicleUseCase getVehicleUseCase = new GetVehicleUseCase(new Vehicle(new VehicleMemLocalDataSource()));
        Vehicle vehicle1 = new Vehicle("1", "X4", "Renault", 4, "Lujoso");
        Vehicle vehicle2 = new Vehicle("2", "X6", "Renault", 4, "Lujoso");
        Vehicle vehicle3 = new Vehicle ("3", "GT500","Renault", 2, "Superdeportivo");

    }

    public static void SaveVehicleUseCase() {
        SaveVehicleUseCase saveVehicleUseCase = new SaveVehicleUseCase(new Vehicle(new VehicleMemLocalDataSource()));

        saveVehicleUseCase.execute(new Vehicle("4","X7","Renault",4,"Lujoso"));

    }
    public static void DeleteVehicleUseCase() {
        DeleteVehicleUseCase deleteVehicleUseCase = new DeleteVehicleUseCase(new Vehicle(new VehicleMemLocalDataSource()));

        deleteVehicleUseCase.execute("1");
        
    }
}
