package Q5;

class FingerprintAuthentication extends AuthenticationMethod {
    @Override
    void authenticate() {
        System.out.println("User authenticated using Fingerprint.");
    }
}
