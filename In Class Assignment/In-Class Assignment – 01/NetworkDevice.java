public class NetworkDevice {
    String deviceID;
    String ipAddress;
    String deviceName;
    boolean isOnline;
    int threatLevel;

    NetworkDevice(String id, String ip, String name, boolean online, int threat) {
        deviceID = id;
        ipAddress = ip;
        deviceName = name;
        isOnline = online;
        threatLevel = threat;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceID);
        System.out.println("Device IP Address: " + ipAddress);
        System.out.println("Device Name: " + deviceName);
        System.out.println("Online Status: " + isOnline);
        System.out.println("Thereat Level: " + threatLevel);
    }

    boolean isCritical() {
        return threatLevel >= 7;
    }

    public static void main(String[] args) {
        NetworkDevice device1 = new NetworkDevice("D01" , "192.168.1.09" , "Router" , true , 7);
        device1.displayStatus();
        System.out.println("Is Critical: " + device1.isCritical());
    }
}

