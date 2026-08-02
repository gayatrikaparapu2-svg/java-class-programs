package javacode;


class Parent {
	int x = 100;

	public Parent() {
		System.out.println("THis is super class contr");
	}

	void addition() {
		System.out.println("add is: " + (x + 200));
	}
}

class Child extends Parent {
	int x = 1000;
	
	public Child() {
		super();
		System.out.println("THis is sub class contr");
	}
	
	void addition() {
		System.out.println("Add from sub class: " + (this.x + super.x));
	}
	
	void callsupermethods() {
		super.addition();   
	}
}

public class SupervsThis {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.callsupermethods();
		ch.addition();
	}
}
