//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 2/16/17
//Class - 6th period
//Lab  -  Expression Solver

/** Output:
 3 + 5 = 8

 3 * 5 = 15

 3 - 5 = -2

 3 / 5 = 0

 5 / 5 * 2 + 8 / 2 + 5 = 11

 5 * 5 + 2 / 2 - 8 + 5 * 5 - 2 = 41
 */

public class ExpressionSolverRunnerStuckiLogan
{
	public static void main( String args[] )
	{
		t("3 + 5");
		t("3 * 5");
		t("3 - 5");
		t("3 / 5");
		t("5 / 5 * 2 + 8 / 2 + 5");
		t("5 * 5 + 2 / 2 - 8 + 5 * 5 - 2");


	}

	public static void t(String e) {
		System.out.println(new ExpressionSolverStuckiLogan(e));
	}
}