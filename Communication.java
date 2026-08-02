package javasample;

class First{
	int x = 10;
	
	void add() {
		System.out.println("Add from first is: " + (x+20));
	}
}

class Second{
	int y = 100;
	First f = new First();
	
	void sub() {
		System.out.println("Sub from second is: " + (y-20));
	}
	
	void access() {
		f.add();
		System.out.println(f.x + " from class First");
	}
}


public class Communication {
	public static void main(String[] args) {
		Second s = new Second();
		s.sub();
		s.access();
	}
}