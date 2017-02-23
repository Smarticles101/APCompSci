//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		for(String name:toys.split(" ")) {

			Toy t = getThatToy(name);
			if(t == null) {
				toyList.add(new Toy(name));
			} else {
				t.setCount(t.getCount()+1);
			}
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for(Toy t: toyList) {
  			if(t.getName().equals(nm)) return t;
		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		String name = "";
  		int high = 0;
  		for(Toy t:toyList) {
  			if(high < t.getCount()) {
  				high = t.getCount();
  				name = t.getName();
			}
		}

  		return name;
  	}  
  
  	public void sortToysByCount()
  	{
		Collections.sort(toyList);
  	}  
  	  
	public String toString() {
	   return toyList.toString();
	}
}