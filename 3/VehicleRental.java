public class VehicleRental {
    int vehicleId;
    String vehicleType;
    double ratePerDay;
    double availableKm;
    boolean isAvailable;

    public VehicleRental() {
        vehicleId = 0;
        vehicleType = "Unknown";
        ratePerDay = 0.0;
        availableKm = 0.0;
        isAvailable = true;
    }

    public VehicleRental(int vehicleId, String vehicleType, double ratePerDay, double availableKm, boolean isAvailable) {
        this.vehicleId = vehicleId;
        this.vehicleType = vehicleType;
        this.ratePerDay = ratePerDay;
        this.availableKm = availableKm;
        this.isAvailable = isAvailable;
    }

    public String rentVehicle(int days, double estimatedKm) {
        if (!isAvailable) {
            return "Vehicle is not available.";
        } else if (estimatedKm > availableKm) {
            return "Estimated kilometers exceed available kilometers.";
        } else {
            isAvailable = false;
            double totalCost = ratePerDay * days;
            return "Vehicle rented successfully. Total cost: Rs. " + totalCost;
        }
    }

    public void returnVehicle(double kmUsed) {
        availableKm = availableKm - kmUsed;
        isAvailable = true;
        System.out.println("Vehicle returned. Available Km: " + availableKm + ", Available: " + isAvailable);
    }

    public String getVehicleInfo() {
        return "Vehicle ID: " + vehicleId +
                ", Vehicle Type: " + vehicleType +
                ", Rate Per Day: Rs. " + ratePerDay +
                ", Available Km: " + availableKm +
                ", Is Available: " + isAvailable;
    }

    public static void main(String[] args) {
        VehicleRental vehicle2 = new VehicleRental(101, "Car", 6000.0, 500.0, true);

        System.out.println(vehicle2.getVehicleInfo());

        System.out.println(vehicle2.rentVehicle(3, 200));
        System.out.println(vehicle2.getVehicleInfo());

        System.out.println(vehicle2.rentVehicle(2, 100));

        vehicle2.returnVehicle(150);
        System.out.println(vehicle2.getVehicleInfo());

        System.out.println(vehicle2.rentVehicle(2, 100));
        System.out.println(vehicle2.getVehicleInfo());
    }
}