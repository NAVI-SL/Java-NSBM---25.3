class Threat {
    String threatId;
    String source;
    String severity;

    public void logThreat() {
        System.out.println("[THREAT LOG] ID: " + threatId + " | Source: " + source + " | Severity:" + severity);
    }

    public void raiseAlert() {
        System.out.println("!! SECURITY ALERT !! Threat " + threatId + " detected from " + source);
    }
}