package ListConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		
		Hashtable h1 = new Hashtable();
		
		h1.put(1, "Test");
		h1.put(2, "Hello");
		h1.put(3, "World");
		
		System.out.println(h1.size());

		Hashtable h2 = new Hashtable();

		h2 = (Hashtable)h1.clone();
		System.out.println("the values from h1"+h1);
		System.out.println("the values from h1"+h2);
		
		h1.clear();
		System.out.println("the values from h1"+h1);
		System.out.println("the values from h1"+h2);
		
		Hashtable st = new Hashtable();
		
        st.put("A", "naveen");

        st.put("B", "manager");

        st.put("C", "selenium");
        
        if(st.containsValue("naveen"))
        	System.out.println("value is found");
        
        // get all the values from hashtable using Enumeration
        Enumeration e = st.elements();
        System.out.println("print values from st");
        while(e.hasMoreElements()) {
        	System.out.println(e.nextElement());
        }
        
        // get all the values from hashtable using entrySet() -- set of values
        Set s = st.entrySet();
        System.out.println(s);
        
        // get the value from a key
        System.out.println(st.get("B"));
        
        System.out.println(st.hashCode());
        
	}

}
