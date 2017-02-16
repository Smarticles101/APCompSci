//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 2/16/17
//Class - 6th period
//Lab  -  ArrayList fun house

import java.util.List;
import java.util.ArrayList;

public class ArrayListFunHouseStuckiLogan
{
	public static ArrayList<Integer> getListOfFactors(int number)
	{
		ArrayList<Integer> l = new ArrayList<Integer>();

		for(int i = 2; i < number; i++) {
			if(number%i==0) {
				l.add(i);
			}
		}

		return l;
	}
	
	public static void keepOnlyCompositeNumbers( List<Integer> nums )
	{
		for(int i = nums.size()-1; i>=0; i--) {
			if(getListOfFactors(nums.get(i)).size()==0) {
				nums.remove(i);
			}
		}
	}
}