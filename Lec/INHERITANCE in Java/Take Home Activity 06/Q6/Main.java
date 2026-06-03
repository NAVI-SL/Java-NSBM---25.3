public class Main {
    public static void main(String[] args) {
        MalwareAttack malware = new MalwareAttack();
        malware.threatId = "T001";
        malware.source = "192.168.1.10";
        malware.severity = "Critical";
        malware.malwareType = "Ransomware";

        malware.logThreat();
        malware.raiseAlert();
        malware.quarantine();

        System.out.println();

        PhishingAttack phishing = new PhishingAttack();
        phishing.threatId = "T002";
        phishing.source = "fake-login@email.com";
        phishing.severity = "High";
        phishing.targetEmail = "student@nsbm.ac.lk";

        phishing.logThreat();
        phishing.raiseAlert();
        phishing.blockEmail();

        System.out.println();

        DDoSAttack ddos = new DDoSAttack();
        ddos.threatId = "T003";
        ddos.source = "203.94.55.12";
        ddos.severity = "Medium";
        ddos.packetCount = 5000;

        ddos.logThreat();
        ddos.raiseAlert();
        ddos.mitigate();
    }
}
