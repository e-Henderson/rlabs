package labSearchAlgorithm;

public class LinearSearch {
	public static void main(String[] args) {
		//create dummy data
		char letter = 'm';
		
		char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l',
				'm','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		//call methods
		LinearSearch ls = new LinearSearch();
		System.out.println(ls.findIndex(letter, letters));
	}
	//create methods 
	public int findIndex(char target, char[] data) {
		if (data==null) return -1;//will return a negative value so as not to interfer
		//with the positive value of the indexes. 
		int result =-1;
		//loop through the data, so use a for loop
		for (int i=0;i<data.length;i++) {
			char temp =data[i];//stores the iteration in this temporary place
			
			if (temp == target) {
				return i;
			}
		}
		
		return result;
	}
}
