//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 2/16/17
//Class - 6th period
//Lab  -  Expression Solver

public class ExpressionSolverStuckiLogan
{
	String expression;
	public ExpressionSolverStuckiLogan(String s)
	{
		setExpression(s);
	}

	public void setExpression(String s)
	{
		expression = s;
	}

	private String solveExpression()
	{
		return solveExpression(this.expression.trim().replaceAll(" ", ""));
	}

	/**
	 *
	 * @param expression
	 * @return solved expression as String
	 *
	 * This method recursively solves a given expression.
	 * It evaluates each operation following order of operations
	 *
	 * If it is given a parseable number, it will return it
	 * otherwise, it will continue to evaluate it
	 */
	private String solveExpression(String expression) {
		try {
			Integer.parseInt(expression);
			return expression;
		} catch (NumberFormatException e) {
			int mult = expression.indexOf("*");
			int div = expression.indexOf("/");
			int add = expression.indexOf("+");
			int sub = expression.indexOf("-");

			int before;
			int after;

			if(mult!=-1 && (mult<div || div == -1)) {
				before = getNum(expression, mult, true);
				after = getNum(expression, mult, false);
				expression = expression.replaceFirst(before + "\\*" + after, before*after + "");
			} else if(div!=-1) {
				before = getNum(expression, div, true);
				after = getNum(expression, div, false);
				expression = expression.replaceFirst(before + "/" + after, before/after + "");
			} else if(add!=-1 && (add<sub || sub==-1)) {
				before = getNum(expression, add, true);
				after = getNum(expression, add, false);
				expression = expression.replaceFirst(before + "\\+" + after, (before+after) + "");
			} else if(sub!=-1) {
				before = getNum(expression, sub, true);
				after = getNum(expression, sub, false);
				expression = expression.replaceFirst(before + "-" + after, (before-after) + "");
			}
		}
		return solveExpression(expression);
	}

	/**
	 *
	 * @param expression
	 * @param target
	 * @param before
	 * @return the biggest parseable number before or after the target
	 *
	 * This method attempts to get a number before or after the target.
	 * It starts at the target and works in the desired direction, each time re setting the number.
	 * If, the desired spot is no longer parseable, it returns the desired number.
	 */
	private static int getNum(String expression, int target, boolean before) {
		int num = 0;
		int direction = 1;

		if(before) {
			direction = -1;
		}

		for (int i = target; i <= expression.length() && i>=0; i+=direction) {
			try {
				if(before) {
					num = Integer.parseInt(expression.substring(i, target));
				} else {
					num = Integer.parseInt(expression.substring(target+1, i));
				}
			} catch (NumberFormatException e) {
				if(i!=target && i!=target+1) {
					return num;
				}
			} catch (StringIndexOutOfBoundsException e) {
				// do nothing.  This only happens when getting after number
			}
		}

		return num;
	}

	public String toString( )
	{
		return this.expression + " = " + solveExpression() + "\n";
	}
}