//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 2/16/17
//Class - 6th period
//Lab  -  ArrayList fun house

/** Output
 [3]
 []
 [2, 5, 10, 25]
 [2, 4, 5, 10, 20, 25, 50]
 [2, 3, 6, 127, 254, 381]
 Original list
 [2, 6, 8, 9, 10, 12, 13, 15, 17, 24, 55, 66, 78, 77, 79]
 Composite list
 [6, 8, 9, 10, 12, 15, 24, 55, 66, 78, 77]
 */

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class ArrayListFunHouseRunnerStuckiLogan
{
	public static void main( String args[] )
	{
		System.out.println(ArrayListFunHouseStuckiLogan.getListOfFactors(9));
		
		System.out.println(ArrayListFunHouseStuckiLogan.getListOfFactors(23));
		
		System.out.println(ArrayListFunHouseStuckiLogan.getListOfFactors(50));
		
		System.out.println(ArrayListFunHouseStuckiLogan.getListOfFactors(100));
		
		System.out.println(ArrayListFunHouseStuckiLogan.getListOfFactors(762));
			
		Integer[] nums = {2,6,8,9,10,12,13,15,17,24,55,66,78,77,79};
		List<Integer> list = new ArrayList<Integer>( Arrays.asList(nums) );

		System.out.println("Original list");
		System.out.println( list );
		ArrayListFunHouseStuckiLogan.keepOnlyCompositeNumbers( list );
		System.out.println("Composite list");
		System.out.println( list );
	}
}