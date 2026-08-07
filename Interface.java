
interface I1{
    int x=100;
    void display();
}
   
    interface I2 extends I1{
        int y=200;
        void show();
    }
 
    class Multi implements I1,I2{
        @Override
        public void display(){
            System.out.println("x = "+x);
        }
        public void show(){
            System.out.println("y = "+y);
        }
        void print(){
            System.out.println("x+y = "+(x+y));
        }
    }
    
    public class Interface {
        public static void main(String[] args) {
            Multi m = new Multi();
            m.display(); // Output: x = 100
            m.show();    // Output: y = 200
            m.print();   // Output: x+y = 300
        }
    }

