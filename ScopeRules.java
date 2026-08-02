package javasample;

public class ScopeRules {
		
		void add() {
			int x=5, y=6;
			System.out.println("Add is : " + (x+y));
		}
		
		void addition(int c) {
			int a=5, b=6;
			System.out.println("Addition of 3 values is: " + (a+b+c));
		}
		
		//method with params and return type(int)
		int sum(int x, int y, int z) {
			return x+y+z+100;
		}
		
		public static void main(String[] args) {
			ScopeRules sr = new ScopeRules();
			int res = sr.sum(12, 34, 56);
			System.out.println("Result is: " + res);
		}
	}


