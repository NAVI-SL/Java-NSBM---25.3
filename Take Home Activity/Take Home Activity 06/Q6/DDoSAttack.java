package Q6;

public class DDoSAttack extends Threat {
    int packetCount;

    public void mitigate() {
        System.out.println("Mitigating DDoS from " + source + " -- " + packetCount + " packets dropped");
    }
}
