public class Son extends Father {
    String laptop;
    
    public void code() {
        System.out.println();
    }

    @Override
    public void travel() {
        System.out.println("Travel via " + car + "is my bithday gift");
    }

    public void call() {
        System.out.println("Can call via ");
    }
}

