/**
 * 
 */
package partB;

/**
 * @author 12312821
 * @param <E>
 *
 */
public class LinkedStack<E> implements Stack<E> {

	public class Node {
		Object element;
		Node next;
		
		public Node(Object element){
			this.element = element;
		}
		
		public String toString() {
			return element.toString();
		}
	}
	
	int size;
	Node top;
	
	
	/**
	 * Constructs an empty linked list
	 */
	public LinkedStack() {
		top = null;
		size = 0;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return top == null;
	}

	@Override
	public void push(E e) {
		Node node = new Node(e);
		node.next = top;
		top = node;
		size++;
	}

	@Override
	public E top() {
		return (E) top;
	}

	@Override
	public E pop() {
		E temp = (E) top;
		top = top.next;
		size--;
		return temp;
	}
	
	//state visualisation
	@Override
	public String toString() {
		String output = "";
		Node node = top;
		while (node != null) {
			output = node.element.toString() + " " + output;
			node = node.next;
		}
		
		return "" + size + "\t" + output;
	}

}
