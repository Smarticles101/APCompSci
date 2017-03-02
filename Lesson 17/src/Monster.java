//A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

/** Output:
 How many monsters are in the herd? :: 7
 Enter the ht :: 7
 Enter the wt :: 20
 Enter the age :: 8


 Enter the ht :: 7
 Enter the wt :: 19
 Enter the age :: 58


 Enter the ht :: 9
 Enter the wt :: 3
 Enter the age :: 2


 Enter the ht :: 7
 Enter the wt :: 20
 Enter the age :: 30


 Enter the ht :: 2
 Enter the wt :: 200
 Enter the age :: 800


 Enter the ht :: 1
 Enter the wt :: 700
 Enter the age :: 2


 Enter the ht :: 10
 Enter the wt :: 3
 Enter the age :: 1


 HERD :: [7 20 8, 7 19 58, 9 3 2, 7 20 30, 2 200 800, 1 700 2, 10 3 1]
 SMALLEST :: 1 700 2
 LARGEST :: 10 3 1
 HERD :: [1 700 2, 2 200 800, 7 20 8, 7 19 58, 7 20 30, 9 3 2, 10 3 1]
 */

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Monster implements Comparable<Monster>
{
    private int height, weight, age;

	public Monster() {
	    this(0,0,0);
    }

    public Monster(int height, int weight, int age) {
	    this.height = height;
	    this.weight = weight;
	    this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
	    return height + " " + weight + " " + age;
    }

    @Override
    public int compareTo(Monster o) {
        if(this.getHeight() < o.getHeight()) return -1;
        else if(this.getHeight() > o.getHeight()) return 1;
        else return 0;
    }
}