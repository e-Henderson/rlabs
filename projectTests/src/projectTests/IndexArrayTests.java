package projectTests;

public class IndexArrayTests {
	public static void main(String[] args) {
		//works with StringBuffer
		String str = "dog";
		StringBuffer str2 = new StringBuffer(str);
		for (int i=0; i<str2.length();i++) {
			System.out.println();
			str2.setCharAt(1, 'k');
			System.out.println("\n"+str2);	
		}
		String word = "Helheim";
		System.out.println(word);
		StringBuffer str3 = new StringBuffer(word);
		str3.setCharAt(2, 'k');
		System.out.println(str3);
	}
}
