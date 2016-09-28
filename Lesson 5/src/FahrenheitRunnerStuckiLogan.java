//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 9/28/16
//Class - 6th period
//Lab  - Fahrenheit lab

/*
 * Output:
98.60 degrees Fahrenheit == 37.00 degrees Celsius

52.30 degrees Fahrenheit == 11.28 degrees Celsius

82.45 degrees Fahrenheit == 28.03 degrees Celsius

75.00 degrees Fahrenheit == 23.89 degrees Celsius

100.00 degrees Fahrenheit == 37.78 degrees Celsius
*/

public class FahrenheitRunnerStuckiLogan {
	public static void main(String[] args) {
		FahrenheitStuckiLogan test = new FahrenheitStuckiLogan();
		
		test.setFahrenheit(98.6);
		test.print();
		
		test.setFahrenheit(52.3);
		test.print();
		
		test.setFahrenheit(82.45);
		test.print();
		
		test.setFahrenheit(75);
		test.print();
		
		test.setFahrenheit(100);
		test.print();
	}
}
