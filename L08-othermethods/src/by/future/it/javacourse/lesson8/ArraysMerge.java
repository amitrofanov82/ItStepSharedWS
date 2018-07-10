package by.future.it.javacourse.lesson8;

public class ArraysMerge {

	public static void main(String[] args) {
		int[] a1 = {4,12,34,43,67};
		int[] a2 = {-4,-2,0,49,670};
		
		
		int[] b = new int[a1.length+a2.length];
		int idxa1 = 0;
		int idxa2 = 0;
		for (int i = 0; i < b.length; i++) {
			if (a1[idxa1]<a2[idxa2]){
				b[i] = a1[idxa1++];
			} else {
				b[i] = a2[idxa2++];
			}
		}
		//Alternative approach:
		int idx1 = 0;
		int idx2 = 0;
		while ((idx1 < a1.length) && (idx2 <a2.length)) {
			if (a1[idx1]<a2[idx2]){
				b[idx1+idx2] = a1[idx1];
				idxa1++;
			} else {
				b[idx1+idx2] = a2[idxa2];
				idxa2++;
			}
		}
		
		
		
		
	}
	
}
