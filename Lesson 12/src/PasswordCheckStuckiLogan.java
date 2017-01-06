
//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 1/6/17
//Class - 6th period
//Lab  - PasswordChecker

import java.util.Scanner;
import static java.lang.System.*;

class PasswordCheckStuckiLogan {
	private String password;

	public PasswordCheckStuckiLogan() {
		this("mchammergohammer");
	}

	public PasswordCheckStuckiLogan(String password) {
		this.password = password;
	}

	public void check() {
		Scanner keyboard = new Scanner(System.in);
		while (true) {
			System.out.print("Enter the password :: ");
			String pass = keyboard.nextLine();
			if (pass.equals(password)) {
				break;
			} else {
				System.out.println("INVALID");
			}
		}
		System.out.println("VALID");
	}
}