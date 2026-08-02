package javacore;

public class ConDemo2 {
	int rollNo;
	String name;
	
//	constructor
	public ConDemo2() {
		this.rollNo = 1234;
		this.name = "Suresh";
		System.out.println("Variables are ready");
	}
	
	void showDetails() {
		System.out.println("My rollNo is: " + rollNo);
		System.out.println("My name is: " + name);
	}
	
	public static void main(String[] args) {
		ConDemo2 cd = new ConDemo2(); //constr call
		cd.showDetails();
	}
}