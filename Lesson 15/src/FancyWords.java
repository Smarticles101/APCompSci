import java.util.Arrays;

public class FancyWords {
    char[] lets;

    public FancyWords(char[] lets) {
        Arrays.sort(lets);
        this.lets = lets;
        System.out.println(Arrays.toString(this.lets));
    }
}