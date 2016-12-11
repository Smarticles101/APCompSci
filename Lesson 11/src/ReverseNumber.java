//A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class ReverseNumber
{
   private int number;

	//add constructors
	public ReverseNumber() {
   		this(0);
	}

	public ReverseNumber(int number) {
		setNum(number);
	}
	
	//add a set method
	public void setNum(int number) {
		this.number = number;
   	}

	public int getReverse()
	{
		int rev=0;
		int num = number;	// don't change number
		while(num>0) {
			rev = (rev*10)+(num%10);
			num/=10;
		}
		return rev;
	}

	//add  a toString	
	public String toString() {
		return number + " reversed is " + getReverse();
	}
}