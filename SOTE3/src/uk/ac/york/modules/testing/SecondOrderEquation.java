package uk.ac.york.modules.testing;

public class SecondOrderEquation extends Equation {
	
	// ax^2+bx+c //
	
	double a;
	double b;
	double c;
	
	public SecondOrderEquation(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	@Override
	public String toString()
	{
		return String.valueOf(a) +  "x^2 + " + String.valueOf(b) +
			   "x + " + String.valueOf(c);
	}
	
	@Override
	public double of(double x)
	{
		return (a * Math.pow(x, 2)) + (b * x) + c;
	}

}
