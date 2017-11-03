package partB;

//Data Structures & Algorithms in Java by Goodrich, Tamassia and Goldwasser referenced in production of this code 

public class ArrayStack <E> implements Stack<E>{
	public static final int CAPACITY=10;
	private E[] A;
	private int t = -1;
	

	public ArrayStack() {
		this(CAPACITY);
	}
	

	public ArrayStack(int n) {
		A = (E[]) new Object[n];
	}

	@Override
	public int size() {
		return t+1;
	}


	@Override
	public boolean isEmpty() {
		return t == -1;
	}


	@Override
	public void push(E e) throws IllegalStateException {
		if (size() == A.length) throw new IllegalStateException("Stack Full!");
		A[++t] = e;
	}


	@Override
	public E top() {
		if (isEmpty()) return null;
		return A[t];
	}


	@Override
	public E pop() {
		if(isEmpty()) return null;
		E e = A[t];
		A[t] = null;
		t--;
		return e;
	}
	
	
	public String toString() {
		String output = size()+"\t";
		int numberOfElements = size();
		for(int i=0; i<numberOfElements;i++){
			output+=(A[i]+" ");
		}
		return output;
	}
	

}
