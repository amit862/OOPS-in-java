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
 class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }  
 } 

public class runTimePolymorphism {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        s1.area();

        // Triangle t1 = new Triangle();
        // t1.area(12, 4);
    }
}
