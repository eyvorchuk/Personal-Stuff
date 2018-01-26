public class ArrayList {
	int[] storage;
	int count;
	
	public ArrayList() {
		count = 0;
		storage = new int[100];
	}
	
	public void addBack(int value) {
		storage[count++] = value;
	}
	
	public int size() {
		return count;
	}
	
	public String toString() {
		String s = "{";
		for (int i = 0; i < count; i++) {
			s += storage[i];
			if (i != count - 1)
				s += ",";
		}
		s += "}";
		return s;
	}
	
	public void removeAllGreater(int min) {
		for (int i = 0; i < count; i++) {
			if (storage[i] > min) {
				for (int j = i; j < count - 1; j++) {
					storage[j] = storage[j+1];
				}
				storage[count - 1] = 0;
				count--;
				i--;
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.addBack(1);
		list.addBack(2);
		list.addBack(3);
		list.addBack(4);
		System.out.println(list);
		list.removeAllGreater(3);
		System.out.println(list);
		ArrayList l2 = new ArrayList();
		l2.addBack(43);
		l2.addBack(12);
		l2.addBack(66);
		l2.addBack(9);
		l2.addBack(111);
		l2.addBack(33);
		l2.addBack(45);
		System.out.println(l2);
		l2.removeAllGreater(30);
		System.out.println(l2);
	}
}