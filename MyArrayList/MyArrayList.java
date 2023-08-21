package MyArrayList;

public class MyArrayList {
	int size, index = 0;
	String[] data;
	
	MyArrayList(int size){
		this.size = size;
		data = new String[size];
	}

	public void add(String add) {
		 data[index] = add;
		 index++;
	}
	public void add(int Index, String add) {
		 String[] temp = new String[size];
		 temp[Index] = add;
		 int j = 0;
		 for(int i = 0; i < temp.length; i++) {
			if(i != Index) {
				temp[i] = data[j];
				j++;
			}
		 }
		 for(int i = 0; i < temp.length; i++) {
			 data[i] = temp[i];
		 }
		 index++;
	}
	
	public void remove() {
		String[] temp = new String[size];
		data[0] = "";
		int j = 0;
		for(int i = 1; i < data.length; i++) {
			temp[j] = data[i];
			j++;
		}
		for(int i = 0; i < temp.length; i++) {
			 data[i] = temp[i];
		 }
		 index--;
		
	}
	public void remove(int Index) {
		String[] temp = new String[size];
		data[Index] = "";
		int j = 0;
		for(int i = 0; i < data.length; i++) {
			if(i != Index) {
				temp[j] = data[i];
				j++;
			}
		}
		for(int i = 0; i < temp.length; i++) {
			 data[i] = temp[i];
		 }
		 index--;
		
	}
	public String get(int Index) {
		return data[Index];
	}
	
	public int size() {
		int size = data.length;
		return size;
	}
	public boolean isEmty() {
		boolean isEmty = true;
		for(int i = 0; i < data.length; i++) {
			if(data[i] != null) {
				isEmty = false;
			}
		}
		return isEmty;	
	}
	public String toString() {
		String toString = "";
		
		toString += "[";
		for(int i = 0; i < data.length; i++) {
		  if(data[i] != null)	{
			toString += data[i];
			if(i != index-1) {
				toString += ", ";
			}
		  }
		}
		toString += "]";
		
		return toString;
	}
	
	
}
