package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		
		int a[] = new int[3];  // static array--size is fixed
		
		// dynamic array--ArrayList
		// can contain duplicate values
		// maintain insertion order
		// synchronized
		// allow random access to fetch element because it stores the value on the basis of indexes
		
		ArrayList ar = new ArrayList();
		
		
		ar.add(10);  // 0
		ar.add(20);  // 1
		ar.add(30);  // 2
		
		System.out.println(ar.size());
		
		ar.add(40);  // 3
		ar.add(50);  // 4
		ar.add(50);  // 6
		
		System.out.println(ar.size());  // size of arraylist
		
		System.out.println(ar.get(4));  // to get value from an index

		// to print all the values from ArrayList
		// 1. use for loop
		// 2. using iterator
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		// non generic vs generic
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("selenium");
		
		ArrayList <E>ar3 = new ArrayList<E>();
		
		// employee class objects
		Employee e1 = new Employee("naveen",27,"qa");
	    Employee e2 = new Employee("tom",28,"dev");
		Employee e3 = new Employee("peter",29,"admin");
		
		// create arraylist
		
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
        ar4.add(e1);
        ar4.add(e2);
        ar4.add(e3);

        // iterator to traverse the values
        Iterator<Employee> it = ar4.iterator();
        while(it.hasNext()) {
        	Employee emp = it.next();
        	System.out.println(emp.name);
            System.out.println(emp.age);
            System.out.println(emp.dept);
        }
		
		// addAll()
		ArrayList<String> ar5 = new ArrayList<String>();
        ar5.add("java");
        ar5.add("javascript");
        ar5.add("test");

        ArrayList<String> ar6 = new ArrayList<String>();
        ar6.add("selenium");
        ar6.add("dev");
        ar6.add("qtp");
        
        ar5.addAll(ar6);
        
        for(int i=0;i<ar5.size();i++) {
        	System.out.println(ar5.get(i));
        }
		
		// removeAll()
        ar5.removeAll(ar6);
        
        for(int i=0;i<ar5.size();i++) {
        	System.out.println(ar5.get(i));
        }
        
        System.out.println("************");
        
        // retainAll()
        
        ArrayList<String> ar7 = new ArrayList<String>();
        ar7.add("selenium");
        ar7.add("java");
        ar7.add("qtp"); 
        
        ArrayList<String> ar8 = new ArrayList<String>();
        ar8.add("selenium");
        ar8.add("dev");
        ar8.add("ruby"); 
        
        ar7.retainAll(ar8);
        
        for(int i=0;i<ar7.size();i++) {
        	System.out.println(ar7.get(i));
        }
        
        
	}

}
