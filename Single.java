package javabasics;

class A{
int x = 10;
	void add() {
		System.out.println("Add from first is: " + (x+20));
	}
}
class B extends A  {
	int y = 200;
	void sub() {
		System.out.println("Sub from second is: " + (y-20));
	}	
}
public class Single {
	public static void main(String[] args) {
		B obj = new B();
		System.out.println("Variable : " + obj.x);
		obj.add();
		obj.sub();
	}
}
