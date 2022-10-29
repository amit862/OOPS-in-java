class Shape {
   public void area(int i, int j) {
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
public class hierarchical_Inheritance{
    public static void main(String[] args) {
        Circle s1 = new Circle();
        // s1.area(4);
        s1.area(4, 2);
    }      
}