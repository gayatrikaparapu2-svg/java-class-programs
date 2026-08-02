package inheritance;
class A {
    void display() {
        System.out.println("This is Class A");
    }
}

class B extends A {
    void show() {
        System.out.println("This is Class B");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.display(); // Calls the inherited method from Class A
        obj.show();    // Calls the method from Class B
    }
}