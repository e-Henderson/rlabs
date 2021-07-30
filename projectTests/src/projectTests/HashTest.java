package projectTests;

import java.util.HashMap;
import java.util.Map;

public class HashTest {
	//HashMap example
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(50, "Stevie");
		map.put(35, "Joan");
		map.put(19, "Felix");
		
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " "+ m.getValue());
		}
	}
}
