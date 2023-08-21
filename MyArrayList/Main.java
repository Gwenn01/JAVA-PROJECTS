package MyArrayList;

public class Main {

	public static void main(String[] args) {
		MyArrayList list = new MyArrayList(6);
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add(1, "S");
		list.remove(3);
		
		System.out.println(list.size());
		
		for(int i = 0; i < list.size()-1; i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		System.out.println(list.toString());
		System.out.println(list.isEmty());

	}

}
