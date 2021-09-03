import java.util.*;
public class LinkedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();

		System.out.println("Create Operations: ");
	    ll.add("A");
	    ll.add("B");
	    ll.addLast("C");
	    ll.addFirst("D");
	    ll.add(2, "E");
	    System.out.println("Read Operations");
	    System.out.println(ll);
	    
	    System.out.println("Remove Operations: ");
	    ll.remove("B");
	    
	    
	    System.out.println("Update Operation: ");
	    ll.set(1,"s" );
	    System.out.println("Updated linked list: "+ ll);
	}

}
