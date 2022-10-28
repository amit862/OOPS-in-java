class Student {
    String name;                    
    int age;
   
    Student() {                   // Non-Parameterized constructor 
        System.out.println("Constructor called");
    }
 }

 
//  class Student {
//     String name;
//     int age;
   
//     Student(String name, int age) {      // Parameterized constructor 
//         this.name = name;
//         this.age = age;
//     }
//  }

//  class Student {
//     String name;
//     int age;
   
//     Student(Student s2) {   // Copy Constructor
//         this.name = s2.name;
//         this.age = s2.age;
//     }
//  }
 
public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
    }
   
}
