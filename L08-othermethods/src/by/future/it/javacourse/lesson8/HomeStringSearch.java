package by.future.it.javacourse.lesson8;

public class HomeStringSearch {

	public static void main(String[] args) {
		// char array[] = {'m','i','r','u',' ','m','i','r',',','a',' ','t','a','n','t','4','i','m',' ','t','a','n','j'};
		char array [] = "To be, or not to be,--that is the question:".toCharArray();
		char search[] = "thar".toCharArray();
		boolean answer = false;
		int k = 0;
		for (int i = 0; i<array.length; i++){
			if ((array[i] == search[k])&&(k<search.length)) {
				k++;
				answer = true;
				if (k == search.length){
					break;
				}
			}else{
				answer = false;
				i=i-k+1;
				k = 0;
			}
		}
			
		if (answer) {
			System.out.println("'array' contains 'search'");
		} else {
			System.out.println("'array' NOT contains 'search'");
		}
	
	}
}




















