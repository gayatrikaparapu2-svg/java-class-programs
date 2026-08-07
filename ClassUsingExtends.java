class C1{
    void display(){
        System.out.println("hello");
    }
}
class Hi extends C1{
    void sound(){
        System.out.println("world");
    }
}


public class ClassUsingExtends {
    
    public static void main(String[] args) {
       Hi hi = new Hi();
        hi.display(); // Output: hello
        hi.sound();  // Output: world
    }
    
}
