//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 9/28/16
//Class - 6th period
//Lab  - Fahrenheit lab

public class FahrenheitStuckiLogan {
	private double fahrenheit;

	public void setFahrenheit(double fahren) {
		fahrenheit = fahren;
	}

	public double getCelsius() {
		double celsius = 0.0;
		celsius = (fahrenheit - 32.0) * (5.0/9.0);
		return celsius;
	}

	public void print() {
		System.out.println(String.format("%.2f", fahrenheit) + " degrees Fahrenheit == " + String.format("%.2f", getCelsius()) + " degrees Celsius" + "\n");
	}
}
