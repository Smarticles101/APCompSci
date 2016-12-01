//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 1/12/16
//Class - 6th period
//Lab  - Multi Table

/** Output:
Multiplication table for 5
1       5
2      10
3      15
4      20
5      25



Multiplication table for 3
1       3
2       6
3       9
4      12
5      15
6      18
7      21



Multiplication table for 1
1       1
2       2
3       3
4       4
5       5
6       6



Multiplication table for 9
1       9
2      18
3      27
4      36
5      45
6      54
7      63
8      72
9      81



Multiplication table for 7
1       7
2      14
3      21
4      28
5      35
6      42
7      49
8      56
 */
import static java.lang.System.*;

public class MultTableRunnerStuckiLogan {
	public static void main(String[] args) {
		// add test cases
		new MultTableStuckiLogan(5, 5).printTable();
		new MultTableStuckiLogan(3, 7).printTable();
		new MultTableStuckiLogan(1, 6).printTable();
		new MultTableStuckiLogan(9, 9).printTable();
		new MultTableStuckiLogan(7, 8).printTable();
	}
}