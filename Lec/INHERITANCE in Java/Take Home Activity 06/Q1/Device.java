public class Device {
   String brand;
   String model;
   boolean isOn;
 
   public void turnOn() {
    isOn = true;
    System.out.println(brand + model + " is now On");
   }

   public void turnOff() {
    isOn = false;
    System.out.println(brand + model + " is now Off");
   }

   public static void main(String[] args){
        SmartDevice s1 = new SmartDevice();
        s1.brand = "Apple";
        s1.model = "Iphone 18 pro max";
        s1.appName = "Smart Things";
        s1.turnOn();
        s1.connectToAPp();
        s1.turnOff();
   }

}
