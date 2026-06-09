package Q6;

public class Main {
    public static void main(String[] args) {

        ThreatDetector[] detectors = {
            new MalwareDetector(),
            new PhishingDetector(),
            new IntrusionDetector()
        };

        for (ThreatDetector detector : detectors) {
            detector.detectThreat();
        }
    }
}
