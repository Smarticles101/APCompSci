//A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TenToAny
{
	private final char[] DIGITS = {'0', '1', '2', '3', '4', '5',
	'6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
	private int base10;
	private int newBase;

	//add constructors
   	public TenToAny() {
   		this(0, 0);
   	}

   	public TenToAny(int base10, int newBase) {
   		setNums(base10, newBase);
   	}
	//add a set method
   	public void setNums(int base10, int newBase) {
   		this.base10 = base10;
   		this.newBase = newBase;
   	}

	public String getNewNum()
	{
		int tempB10copy = base10;
		String newNum="";
		while(tempB10copy>0) {
			newNum = DIGITS[tempB10copy%newBase] + newNum;
			tempB10copy/=newBase;
		}
		return newNum;
	}

	public String toString() {
		return base10 + " base 10 is " + getNewNum() + " in base " + newBase;
	}	
	
}