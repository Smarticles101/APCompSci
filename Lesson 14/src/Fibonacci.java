//� A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 24/1/17
//Class - 6th period
//Lab  -  Fibonacci

public class Fibonacci
{
	//instance variable
    int[] seq;
	//constructors
    public Fibonacci() {
        this(0);
    }
    public Fibonacci(int size) {
        setSeq(size);
    }
	//set method
    public void setSeq(int size) {
        this.seq = new int[size];
        for(int i = 0; i<size; i++) {
            if(i<2) {
                this.seq[i] = 1;
            } else {
                this.seq[i] = this.seq[i-1] + this.seq[i-2];
            }
        }
    }
	//get method

    public int getNthNum(int nth) {
        try {
            return this.seq[nth-1];
        } catch (ArrayIndexOutOfBoundsException e) {
            return -1;
        }
    }


}