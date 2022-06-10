package collections.motivity;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<String>s=new Stack<>();//last in first out
		s.add("bunty");
		s.add("manty");
		s.add("cunty");
		s.add("uinty");
		s.add("gunty");
		s.add("laddu");
		s.add("dolly");
		s.add("potti");
		
		
		System.out.println(s.pop());//it ill give the last value wt u have 
		System.out.println(s);
		System.out.println(s.push("venu"));// it is used the add element
		System.out.println(s);
		System.out.println(s.search("venu"));//it is used to search an element index
		System.out.println(s.isEmpty());//weather the it is empty or not
		System.out.println(s.search("vj")); //it ill return -1
		System.out.println(s.peek());//it ill give first element
		System.out.println(s.capacity());//it ill how the capacity increases for the limit exits
		s.ensureCapacity(500);//now capacity is 500 for stack
		System.out.println(s);
		System.out.println(s.lastElement());
		System.out.println(s.firstElement());
		System.out.println(s.contains("venu"));
		System.out.println(s.remove(1));
		System.out.println(s);
		s.add(2, "jonny");
		System.out.println(s);
		System.out.println(s.equals(s));
		
		
		
		
		

	}

}
