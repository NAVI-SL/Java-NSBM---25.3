package Q6;

public class PhishingAlert extends SecurityAlert {
    String targetEmail;

    @Override
    void raiseAlert() {
        System.out.println("[PHISHING] Attack targeting " + targetEmail + " from " + source + "!");
    }

    void blockEmail() {
        System.out.println("Blocking phishing email targeting: " + targetEmail);
    }
}
