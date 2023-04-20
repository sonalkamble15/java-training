package basic;

public class CalculatorEntry {
	
		public static void main(String[] args) {
			int p = 5;
			int q = 8;
			Maths m = new Maths();
			m.addition(p,q);
			m.substraction(p,q);
			m.multiplication(p,q);
			m.division(p, q);
			m.square(q);
			m.cube(p);	
		}

}
