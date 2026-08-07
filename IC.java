interface I1{
    void display();
}
class Hello implements I1{
    @Override
    public void display(){
        System.out.println("Hello class implementation of display method");
    }
}
public class IC {

    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.display(); // Output: Hello class implementation of display method
    }
}