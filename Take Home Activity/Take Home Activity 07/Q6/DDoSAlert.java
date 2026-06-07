package Q6;

public class DDoSAlert extends SecurityAlert{
    int packetCount;

    @Override
    void raiseAlert() {
        System.out.println("[DDoS] " + source + " - " + packetCount + " packets!");
    }

    void mitigate() {
        System.out.println("Mitigating DDoS from " + source + " -" + packetCount + " packets dropped");
    }
}
