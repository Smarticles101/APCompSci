import java.util.Arrays;

public class NumberSearch {
    int[] nums;
    int target;

    public NumberSearch(int target, int... nums) {
        this.target = target;
        this.nums = nums;
    }

    public int nextBiggest() {
        Arrays.sort(this.nums);
        for(int i = 0; i<this.nums.length; i++) {
            if(this.nums[i]>this.target) return this.nums[i];
        }
        return 0;
    }

    public String toString() {
        return Arrays.toString(this.nums) + "\n" +
                "The next largest value after "+this.target+" is "+nextBiggest();
    }
}
