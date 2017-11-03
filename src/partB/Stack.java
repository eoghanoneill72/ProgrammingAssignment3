package partB;

/**
 * @author 12312821
 * Data Structures & Algorithms in Java by Goodrich, Tamassia and Goldwasser referenced in production of this code 
 * @param <E>
 */
public interface Stack<E> {
	
	/**
	 * returns how many elements in stack
	 * @return number of elements in stack
	 */
	int size();
	
	/**
	 * Tests if stack is empty
	 * @return True if stack is empty
	 */
	boolean isEmpty();
	
	/**
	 * add element to top of stack
	 * @param e added to stack
	 */
	void push(E e);
	
	/**
	 * peeks at element at top of stack
	 * @return object at stop of stack
	 */
	E top();
	

	/**
	 * Remove object from stack
	 * @return object e removed from stack
	 */
	E pop();
	
}
