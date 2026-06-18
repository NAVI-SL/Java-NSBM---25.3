public class Printer {

    void print(String message) {
        System.out.println("message is: " + message);
    }

    void print(int value) {
        System.out.println("int is: " + value);
    }

    void print(String message, int copies) {
        System.out.println("message: " + message + "copies: " + copies);
    }
}
