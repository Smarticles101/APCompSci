//� A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 24/1/17
//Class - 6th period
//Lab  -  Roman Numeral

import static java.lang.System.*;

public class RomanNumeralStuckiLogan {
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeralStuckiLogan(String str) {
		setRoman(str);
	}

	public RomanNumeralStuckiLogan(Integer orig) {

		setNumber(orig);

	}

	public void setNumber(Integer num) {


		number = num;
		roman = "";
		for(int i = 0; i< NUMBERS.length; i++) {
			while (num >= NUMBERS[i]) {
				roman+=LETTERS[i];
				num-=NUMBERS[i];
			}
		}

	}

	public void setRoman(String rom) {

		roman = rom;
		number = 0;
		for(int i = 0; i<LETTERS.length; i++) {
			while(rom.indexOf(LETTERS[i])==0) {
				number += NUMBERS[i];
				rom = rom.substring(LETTERS[i].length());
			}
		}

	}

	public Integer getNumber()
	{
		return number;
	}

	public String toString()
	{
		return roman + "\n";
	}
}