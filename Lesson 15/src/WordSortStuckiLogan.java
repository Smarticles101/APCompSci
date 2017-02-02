//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 2/2/17
//Class - 6th
//Lab - Word Sort

import java.util.Arrays;

public class WordSortStuckiLogan {
    String[] words;

    public WordSortStuckiLogan() {
        this("");
    }

    public WordSortStuckiLogan(String... words) {
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
