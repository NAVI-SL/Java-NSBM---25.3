package Q4;

public class Main {
    public static void main(String []args) {
        AutonomousVehicle a1 = new AutonomousVehicle();
        a1.make = "Tesla";
        a1.speed = 120;
        a1.batteryLevel = 45;
        a1.move();
        a1.showBattery();
        a1.chargeBattery();
        a1.enableAutopilot();
    }
}
