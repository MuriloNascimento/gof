package pattern.iterator;

import java.util.Iterator;

public class NamesList implements Iterable<String> {
	
	private String[] names;
	private int length;

	@Override
	public Iterator<String> iterator() {
		return this.new IteratorNames();
	}
	
	public NamesList(String[] names) {
		super();
		this.names = names;
		this.length = this.names.length;
	}
	
	private class IteratorNames implements Iterator<String>{
		private int i = 0;
		@Override
		public boolean hasNext() {
			return this.i < NamesList.this.length;
		}
		@Override
		public String next() {
			return NamesList.this.names[i++];
		}
		@Override
		public void remove() {
			NamesList.this.names[i] = null ;
			for(int j = i; (j + 1) < NamesList.this.length; j++) {
				NamesList.this.names[j] = NamesList.this.names[j+1];
			}
			NamesList.this.length--;
		}
	}

	

	public String[] getNames() {
		return names;
	}

	public void setNames(String[] names) {
		this.names = names;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

}
