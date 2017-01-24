//� A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 24/1/17
//Class - 6th period
//Lab  -  Fibonacci

/** Output:
 1
 1
 2
 3
 5
 8
 89
 987
 10946
 1346269
 165580141
 1836311903
 1
 1
 1
 -1
 */

public class FibonacciRunner
{
	public static void main(String args[])
	{
		Fibonacci t = new Fibonacci(50);
		System.out.println(t.getNthNum(1));
		System.out.println(t.getNthNum(2));
		System.out.println(t.getNthNum(3));
		System.out.println(t.getNthNum(4));
		System.out.println(t.getNthNum(5));
		System.out.println(t.getNthNum(6));
		System.out.println(t.getNthNum(11));
		System.out.println(t.getNthNum(16));
		System.out.println(t.getNthNum(21));
		System.out.println(t.getNthNum(31));
		System.out.println(t.getNthNum(41));
		System.out.println(t.getNthNum(46));
		t.setSeq(1);
		System.out.println(t.getNthNum(1));
		t.setSeq(2);
		System.out.println(t.getNthNum(1));
		System.out.println(t.getNthNum(2));
		System.out.println(t.getNthNum(11));
	}
}