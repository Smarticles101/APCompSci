import java.util.Arrays;

public class WordSort {
    String[] words;

    public WordSort() {
        this("");
    }

    public WordSort(String... words) {
        this.words = words;
    }

    public String toString() {
        String out = "";
        Arrays.sort(this.words);
        for(int i = 0; i<this.words.length; i++) {
            out+="word " + i + " :: " + this.words[i] + "\n";
        }
        return out;
    }
}
