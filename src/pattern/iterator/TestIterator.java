package pattern.iterator;

import java.util.Iterator;

public class TestIterator {
	
	public static void main(String[] args) {
		String[] names = new String[4];
		
		names[0] = "Michel";
		names[1] = "Jonas";
		names[2] = "Alex";
		names[3] = "Brian";
		
		NamesList namesList = new NamesList(names);
		Iterator<String> iterator = namesList.iterator();
		iterator.hasNext();
		iterator.remove();
		
		while (iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		
	}

}
