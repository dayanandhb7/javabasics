package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();

		// add :
		ll.add("test");
		ll.add("QTP");
		ll.add("SELENIUM");
		ll.add("RPA");
		ll.add("RFT");

		// print :
		System.out.println("contents of linkedlist is:" + ll);

		// add first :
		ll.addFirst("naveen");

		// add last
		ll.addLast("automation");
		System.out.println("contents of linkedlist is:" + ll);

		// get :
		System.out.println(ll.get(0));
		// set :
		ll.set(0, "Tom");
		System.out.println(ll.get(0));

		// remove first and last element
		ll.removeFirst();
		ll.removeLast();
		System.out.println("contents of linkedlist is:" + ll);

		ll.remove(2);
		System.out.println("contents of linkedlist is:" + ll);

		// how to print all the values of linkedlist :
		// for loop :
		System.out.println("using for loop");
		for (int n = 0; n < ll.size(); n++) {
			System.out.println(ll.get(n));
		}

		// advance for loop
		System.out.println("using advance for loop");
		for (String str : ll) {
			System.out.println(str);
		}

		// iterator
		System.out.println("using iterator");
		Iterator<String> it = ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// using while loop
		System.out.println("using while loop");

		int num = 0;
		while (ll.size() > num) {
			System.out.println(ll.get(num));
			num++;

		}

	}

}
