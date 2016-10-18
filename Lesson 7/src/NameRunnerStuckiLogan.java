//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 10/17/16
//Class - 6th period
//Lab  - Name lab

/* Output:
Jack
Loyd
Jack Loyd


Hillary
Clinton
Hillary Clinton


Tracy
Morgan
Tracy Morgan


Lady
Gaga
Lady Gaga


Roger
Federer
Roger Federer
*/

import static java.lang.System.*;

public class NameRunnerStuckiLogan {
	public static void main ( String[] args ) {
		NameStuckiLogan person = new NameStuckiLogan("Jack Loyd");
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		System.out.println(person);

		person.setName("Hillary Clinton");	// why
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		System.out.println(person);

		person.setName("Tracy Morgan");
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		System.out.println(person);

		person.setName("Lady Gaga");
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		System.out.println(person);

		person.setName("Roger Federer");
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		System.out.println(person);
	}
}
