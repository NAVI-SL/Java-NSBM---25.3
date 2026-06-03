public class PhishingAttack extends Threat{
    String targetEmail;

    public void blockEmail() {
        System.out.println("Blocking phishing email targeting: " + targetEmail);
    }
}
