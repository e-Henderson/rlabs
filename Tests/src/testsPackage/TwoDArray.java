package testsPackage;

import java.util.ArrayList;

public class TwoDArray {
	public static void main(String[] args) {
		//need to create a 2d array list
		ArrayList<ArrayList<String>> twoDArr = new ArrayList<ArrayList<String>>();
		
		//creating lists one by one
		ArrayList<String> str1 = new ArrayList<String>();
		str1.add("A");
		str1.add("B");
		str1.add("C");
		twoDArr.add(str1);
		
		ArrayList<String> str2 = new ArrayList<String>();
		str2.add("Bill");
		str2.add("Rebecca");
		str2.add("Emma");
		twoDArr.add(str2);
		
		ArrayList<String> str3 = new ArrayList<String>();
		str3.add("B");
		str3.add("B");
		str3.add("C");
		twoDArr.add(str3);
		
		for (int i =0; i<twoDArr.size();i++) {
			for (int j=0; j<twoDArr.get(i).size();j++) {
				System.out.println(twoDArr.get(i).get(j));
			}
		}System.out.println(twoDArr);
		
	}
}
