package practice;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaSet {

	public static void main(String[] args) {

		Set<String> hash_Set = new HashSet<String>();
		hash_Set.add("Geeks");
		hash_Set.add("For");
		hash_Set.add("Geeks");
		hash_Set.add("Example");
		hash_Set.add("Set");
		System.out.print("");

		System.out.println(hash_Set);

		// Set demonstration using TreeSet
		System.out.print("Sorted Set after passing into TreeSet");
		Set<String> tree_Set = new TreeSet<String>(hash_Set);
		System.out.println(tree_Set);

	}
}
