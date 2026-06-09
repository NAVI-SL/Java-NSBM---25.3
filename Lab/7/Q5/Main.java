package Q5;

public class Main {
    public static void main(String[] args) {

        AuthenticationMethod[] methods = {new PasswordAuthentication(), new FingerprintAuthentication(), new FaceRecognitionAuthentication()};

        for (AuthenticationMethod method : methods) {
            method.authenticate();
        }
    }
}
