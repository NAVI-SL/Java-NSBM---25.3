package Q6;

public class Main {
    public static void main(String[] args) {
 
        MalwareAlert m1 = new MalwareAlert();
        m1.alertId = "ALT-001";
        m1.source = "192.168.1.5";
        m1.severity = "Critical";
        m1.malwareType = "Ransomware";

        m1.logAlert();
        m1.logAlert("Encrypted 3 files");
        m1.logAlert("Encrypted 3 files", true);
        m1.raiseAlert();
        m1.quarantine();

        System.out.println();

        SecurityAlert[] alerts = new SecurityAlert[3];

        MalwareAlert malware = new MalwareAlert();
        malware.alertId = "ALT-001";
        malware.source = "192.168.1.5";
        malware.severity = "Critical";
        malware.malwareType = "Ransomware";

        PhishingAlert phishing = new PhishingAlert();
        phishing.alertId = "ALT-002";
        phishing.source = "evil.com";
        phishing.severity = "High";
        phishing.targetEmail = "admin@nsbm.ac.lk";

        DDoSAlert ddos = new DDoSAlert();
        ddos.alertId = "ALT-003";
        ddos.source = "10.0.0.99";
        ddos.severity = "Critical";
        ddos.packetCount = 50000;

        alerts[0] = malware;
        alerts[1] = phishing;
        alerts[2] = ddos;

        for (SecurityAlert alert : alerts) {
            alert.logAlert();
            alert.raiseAlert();
            System.out.println();
        }
    }
}
