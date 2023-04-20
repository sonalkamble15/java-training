package basic;

public class Maths {
	
	int answer;
	
	public void addition(int p,int q)
    {
       answer = p + q;
       System.out.println("Addition of p & q = "+ answer);
    }
	
	public void substraction(int p, int q)
    {
        answer = p - q;
        System.out.println("substractions of p & q = "+ answer);
    }
    
    public void multiplication(int p, int q)
    {
        answer = p * q;
        System.out.println("multiplication of p & q = "+ answer);
    }
    
    public void division(int p, int q)
    {
        answer = p / q;
        System.out.println("division of p & q = "+ answer);
    }
    
    public void square(int q)
    {
        answer = q * q;
        System.out.println("square of q " + q + " is "+ answer);
    }
    
    public void cube(int p)
    {
        answer = p * p * p;
        System.out.println("cube of p " + p + " is "+ answer);
    }
}