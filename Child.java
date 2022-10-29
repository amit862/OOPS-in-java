class HumanBody {
    public void displayHuman() {
        System.out.println("Method defined inside HumanBody class");
    }
}

interface Male {
    public void show();
}

interface Female {
    public void show();
}

// Single Inheritance is the relationship between Child // class and HumanBody
// class.
// Implementing Male and Female interface is Multiple // Inheritance
public class Child extends HumanBody implements Male, Female {
    public void show() {
        System.out.println("Implementation of show() method defined in interfaces Male and Female");
    }

    public void displayChild() {
        System.out.println("Method defined inside Child class");
    }

    public class Hybrid_inheritance {
        public void main (String[] args) {
            Child obj = new Child();
            System.out.println("Implementation of Hybrid Inheritance in Java");
            obj.show();
            obj.displayChild();
        }
    }

}
