package lesson22.hashset_template;

public class HashSet implements Set {
	
	private LinkedList[] hashTable;
	int currentList = -1;
	int currentListIdx = -1;
	
	public HashSet(int expectedCapacity){
		hashTable = new LinkedList[(int) (0.1 * expectedCapacity)+1];
		for (int i = 0; i < hashTable.length; i++) {
			hashTable[i] = new LinkedList();
		}
	}
	
	public HashSet(){
		this(99);
	}

	@Override
	public void add(Object o) {
		// TODO Auto-generated method stub
	}

	@Override
	public void remove(Object o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return -1;
	}


}
