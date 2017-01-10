//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 1/6/17
//Class - 6th period
//Lab  - Biggest String

public class BiggestStringStuckiLogan {
	private String[] words;

	public BiggestStringStuckiLogan() {
		this("", "", "");
	}

	public BiggestStringStuckiLogan(String... words) {
		setStrings(words);
	}

	public void setStrings(String... words) {
		this.words = words;
	}

	public String getBiggest() {
		boolean done = false;
		while(done == false){
			done = true;
			for(int i=0;i<words.length-1;i++)
			{
				int num = 0;
				if(words[i] != null && words[i + 1] != null)
				{
					String name1=words[i]; String name2=words[i+1];
					num=name1.compareTo(name2);
				}
				else if(words[i] == null && words[i + 1] == null){
					num = 0;
				}
				else if(words[i] == null){
					num = 1;
				}
				else {
					num = -1;
				}
				if(num>0)
				{
					String temp=words[i];
					words[i]=words[i+1];
					words[i+1]=temp;
					done=false;
				}
			}
		}
		return words[words.length-1];
	}

	public String toString() {
		String joined = "";
		for(String word:words) {
			joined+=word+" ";
		}
		return joined;
	}
}