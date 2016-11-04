//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 3/11/16
//Class - 6th period
//Lab  - Social Security

import static java.lang.System.*;

public class SocialStuckiLogan {
   private String socialNum;
   private int sum;

	public SocialStuckiLogan() {
		this("");
	}

	public SocialStuckiLogan(String soc) {
		setWord(soc);
	}


	public void setWord(String w) {
		socialNum = w;
		sum = 0;
	}

	public void chopAndAdd() {
		int firstDash = socialNum.indexOf('-');
		String sub = socialNum.substring(0, firstDash);
		sum+=Integer.parseInt(sub);
		sub=socialNum.substring(firstDash+1, socialNum.indexOf('-', firstDash+1));
		sum+=Integer.parseInt(sub);
		sub=socialNum.substring(socialNum.lastIndexOf('-')+1);
		sum+=Integer.parseInt(sub);
	}

	public String toString() {
		return "SS# " + socialNum + " has a total of " + sum + "\n";
	}
}
