package partB;

import partB.LinkedStack;

public class LinkedStackStart {

		public static void main(String[] args) {
			
			LinkedStack<String> s = new LinkedStack<String>();
			System.out.println(s);
			s.push("A");
			System.out.println(s);
			s.push("B");
			System.out.println(s);
			s.push("C");
			System.out.println(s);
		}

	}
