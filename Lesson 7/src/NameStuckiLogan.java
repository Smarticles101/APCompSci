//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 10/17/16
//Class - 6th period
//Lab  - Name lab

import static java.lang.System.*;

public class NameStuckiLogan {
	private String name;

	public NameStuckiLogan() {
		this("");
	}

	public NameStuckiLogan(String s) {
		setName(s);
	}

   public void setName(String s) {
	   name = s;
   }

	public String getFirst() {
		return name.substring(0,name.indexOf(' ')); // we could also use String.split(' '), write it to an array, and return the 0 index
	}												// yes, i do have too much time on my hands ¯\_(ツ)_/¯

	public String getLast() {
		return name.substring(name.indexOf(' ') + 1);
	}

 	public String toString() {
 		return name + "\n\n";
	}
}
