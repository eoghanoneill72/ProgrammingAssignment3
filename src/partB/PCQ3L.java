package partB;

public class PCQ3L {

	/**
	 * Simulates operations with a linked list implemented stack as per Part C Question 3
	 * Generic programming used therefore object.getValue() protocol not used.
	 * Generic types used instead of raw types therefore autoboxing replaces need for explicit casting.
	 * @param args
	 */
	public static void main(String[] args) {
			
		ArrayStack<String> s = new ArrayStack<String>();
		System.out.println(s);
		s.push("Ireland");
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.push("England");
		System.out.println(s);
		s.pop();
		s.push("Wales");
		System.out.println(s);
		s.pop();
		s.push("Scotland");
		System.out.println(s);
		s.pop();
		s.push("France");
		System.out.println(s);
		s.push("Germany");
		System.out.println(s);
	}

}