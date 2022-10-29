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
class EquilateralTriangle extends Triangle {
   int side;
}

public class multilevelInheritance{
   public static void main(String[] args) {
      EquilateralTriangle a1 = new EquilateralTriangle();
      a1.area();
      // a1.area(12, 6);
   }
}