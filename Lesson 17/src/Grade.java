//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Grade
{
  private double value;

  //add in two constructors
  public Grade() {
    this(0);
  }

  public Grade(double value){
    setNumericGrade(value);
  }

  public double getNumericGrade() {
    return value;
  }

  public void setNumericGrade(double value) {
    this.value = value;
  }

  public char getLetterGrade() {
    char grade;
    if(value>=90.0) grade = 'A';
    else if(value>=80.0) grade='B';
    else if(value>=70.0) grade='C';
    else if(value>=60.0) grade='D';
    else grade='F';
    return grade;
  }

  //toString method

  public String toString() {
    return value+"\n"+getLetterGrade()+"\n";
  }
}
