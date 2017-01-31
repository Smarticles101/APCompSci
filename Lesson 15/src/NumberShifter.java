import java.util.Arrays;

public class NumberShifter {
    int[] nums;

    public NumberShifter() {
        this.nums = new int[20];
        for(int i = 0; i<this.nums.length; i++) {
            this.nums[i] = (int)Math.ceil(Math.random()*10);
        }
    }

    public int[] shift() {
        int[] newNums = this.nums;

        for(int i = 0; i<newNums.length; i++) {
            if(newNums[i]==7) {
                for (int j = i; j >= 0; j--) {
                    if (j == 0 || newNums[j - 1] == 7) {
                        int t = newNums[j];
                        newNums[j] = newNums[i];
                        newNums[i] = t;
                        break;
                    }
                }
            }
        }

        return newNums;
    }

    public String toString() {
        return Arrays.toString(this.nums) + "\n" + Arrays.toString(shift()) + "\n";
    }
}
