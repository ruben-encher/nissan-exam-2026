package features.data;

import features.domain.VehicleRepository;

public class Vehicle implements VehicleRepository {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
