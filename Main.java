interface cat {
    void sound();
}
class dog{
    void sound(){
        System.out.println("Dog barks");
    }
}

class rabbit extends dog implements cat{
    @Override
    public void sound(){
        System.out.println("Rabbit squeaks");
    }
}

public class Main {
    public static void main(String[] args) {
        rabbit r = new rabbit();
        r.sound(); // Output: Rabbit squeaks
    }
    
}
