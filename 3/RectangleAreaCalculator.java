public class RectangleAreaCalculator {
    private double length ,width;
    RectangleAreaCalculator(double length ,double width){
        this.length = length;
        this.width = width;


    }
    double calculateArea(){
        return length*width;
    }
    public static void main(String[] args){
        RectangleAreaCalculator rectangle1 = new RectangleAreaCalculator(5.0, 3.0);
        System.out.println("Area of the rectangle: " + rectangle1.calculateArea());
    }
}
public class C1 {
    int n1,n2;
    C1(){

    }
    int addNum(int n1,int n2){
        return n1+n2;
    }
    public static void main(String[] args){
        C1 c1 = new C1();
        System.out.println("Sum is "+ c1.addNum(10,20));
    }

}