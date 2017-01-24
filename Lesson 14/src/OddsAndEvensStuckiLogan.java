//� A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 24/1/17
//Class - 6th period
//Lab  -  Odds and Evens

import java.util.Scanner;

public class OddsAndEvensStuckiLogan
{
	private static int countEm(int[] array, boolean odd)
	{
		int c = 0;
		for(int i : array) {
			if(odd && i%2!=0) {
				c++;
			}
			if(!odd && i%2==0) {
				c++;
			}
		}
		return c;
	}
	
	public static int[] getAllEvens(int[] array)
	{
		int[] evens = new int[countEm(array, false)];
		int off = 0;
		for(int i = 0; i<array.length; i++) {
			if(array[i]%2==0) {
				evens[i-off] = array[i];
			} else {
				off++;
			}
		}
		return evens;
	}

	// true? "yes":"no";

	public static int[] getAllOdds(int[] array)
	{
		int[] odds = new int[countEm(array, true)];
		int off = 0;
		for(int i = 0; i<array.length; i++) {
			if(array[i]%2!=0) {
				odds[i-off] = array[i];
			} else {
				off++;
			}
		}
		return odds;
	}
}