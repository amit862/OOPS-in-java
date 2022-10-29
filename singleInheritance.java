class Shape {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
 }
 class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println((1/2)*b*h);
    }  
 }
 
public class singleInheritance {
    Triangle t1 = new Triangle();
    t1.area(12, 4);
  
}
