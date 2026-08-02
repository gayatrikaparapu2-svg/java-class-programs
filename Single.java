package javacode;


class A {
	int x = 10;
	int access = 1234;

	void add() {
		System.out.println("Add from first is: " + (x + 20));
	}
	
	void mul() {
		System.out.println("Mul " + (x*2));
	}
}

class B extends A {
	int y = 200;

	void sub() {
		System.out.println("Sub from second is: " + (y - 20));
	}
	
	@Override
	void add() {
		int l =3,m=4;
		System.out.println("From sub class add: " + (l+m+100));
	}
	
	//overload
	void mul(int b) {
		System.out.println("Mul in sub class: " + (this.x * b));
	}
}

public class Single {
	public static void main(String[] args) {
		B obj = new B();
		System.out.println("Variable : " + obj.x);
		obj.add();
		obj.sub();
		System.out.println(obj.access);
		obj.mul(20);
		obj.mul();
	}
}
