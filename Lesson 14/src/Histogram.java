//� A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 24/1/17
//Class - 6th period
//Lab  -  Histogram

import java.util.Scanner;

public class Histogram
{
	//add and int[] array instance variable
    int[] nums;
	//constructor
    public Histogram() {
        this(new int[0]);
    }

    public Histogram(int[] nums) {
        setNums(nums);
    }

	//set method

    public void setNums(int[] nums) {
        this.nums = nums;
    }
	//toString method
    public String toString() {
        String out = "";
        for(int i = 0; i<10; i++) {
            int c = 0;
            for(int j:this.nums) {
                if(i==j) {
                    c++;
                }
            }
            out+=i+" - "+c+"\n";
        }
        return out;
    }
}