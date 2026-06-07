package Q6;

public class SecurityAlert {
    String alertId;
    String source;
    String severity;

    void logAlert() {
        System.out.println("[ALERT] ID: " + alertId + " | Source: " + source + " | Severity: " + severity);
    }

    void logAlert(String extraInfo) {
        System.out.println("[ALERT] ID: " + alertId + " | Source: " + source + " | Severity: " + severity + " | Info: " + extraInfo);
    }

    void logAlert(String extraInfo, boolean sendEmail) {
        System.out.println("[ALERT] ID: " + alertId + " | Source: " + source + " | Severity: " + severity + " | Info: " + extraInfo);

        if (sendEmail) {
            System.out.println("Email notification sent for " + alertId);
        }
    }

    void raiseAlert() {
        System.out.println("!! SECURITY ALERT !! " + alertId + " from " + source);
    }
}
