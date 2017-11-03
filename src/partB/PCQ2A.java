package partB;

public class PCQ2A {

	public static void main(String[] args) {
		/**
		 * Simulates operations with a linked list implemented stack as per Part C Question 2
		 * Generic programming used therefore object.getValue() protocol not used.
		 * Generic types used instead of raw types therefore autoboxing replaces need for explicit casting.
		 * @param args
		 */
			
		ArrayStack<Character> s = new ArrayStack<Character>();
		System.out.println(s);
		s.push('e');
		System.out.println(s);
		s.push('s');
		System.out.println(s);
		s.push('c');
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.push('u');
		System.out.println(s);
		s.push('a');
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.push('o');
		System.out.println(s);
		s.push('t');
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.push('h');
		System.out.println(s);
	}

}