package whicharein;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WhichAreIn {

	public static String[] inArray(String[] array1, String[] array2) {
		List<String> r = new ArrayList<String>();
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array1.length; j++) {
				if (array2[i].contains(array1[j])) {
					set.add(array1[j]);
				}
			}
		}
		for (String string : set) {
			r.add(string);
		}
		java.util.Collections.sort(r);

		return r.toArray(new String[r.size()]);
	}

	public static void main(String[] args) {
		String a[] = new String[] { "arp", "live", "strong" };
		String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
		String c[] = inArray(a, b);
		for (String string : c) {
			System.out.println(string);
		}
	}
}
