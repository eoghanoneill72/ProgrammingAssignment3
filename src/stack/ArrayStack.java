/**
 * 
 */
package stack;

/**
 * @author 12312821
 *
 */
public class ArrayStack {
	
	private int n;
	private String[] A;
	private int t = 0;
	
	/**
	 * A stack implemented using an array
	 * @param n size of array
	 */
	public ArrayStack() {
		this(10);
	}

	/**
	 * A stack implemented using an array
	 * @param n size of array
	 */
	public ArrayStack(int n) {
		this.n = n;
		A = new String[n];
	}
	
	public void push(String str) {
		A[t] = str;
		System.out.println(t);
		t++;
	}
	
	public int size() {
		return t+1;
	}
	
	public boolean isEmpty() {
		return n==0;
	}
	
	public String pop() {
		String temp = A[t];
		t--;
		return temp;
	}
	
	public String top() {
		return A[t];
	}
	
	public String toString() {
		String output = this.size()+"\t";
		int numberOfElements = this.size();
		for(int i=0; i< numberOfElements ;i++)
		output+= this.pop();
		return output;
		}

}
