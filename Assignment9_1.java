package AssignmentSession9;

import java.util.HashMap;
import java.util.Set;

public class Assignment9_1 {

	public static void main(String[] args) {

		int[] Empcode = { 1, 2, 3, 4, 5 };
		
		String[] EmpName = { "Zair", "Cameron", "Karissa", "Alex", "Rahib"};

		HashMap<Object, Object> hm = new HashMap<>();

		for (int i = 0; i < 5; i++) {
			hm.put(Empcode[i], EmpName[i]);
		}
		System.out.println(hm.values());

	}
	}
