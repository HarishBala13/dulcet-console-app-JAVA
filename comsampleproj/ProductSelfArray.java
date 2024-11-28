package comsampleproj;

import java.util.Arrays;

public class ProductSelfArray {
	public static void main(String args[]) {
		int[] arr = {1,2,3,4};
		int[] result = new int[arr.length];
		int l = 1;
		int r = 1;
		for (int i=0; i<arr.length; i++) {
	        result[i] = 1;
	    }
		for(int i=0; i<arr.length; i++) {
			result[i] *= l;
			l *= arr[i];
		}
		for(int i=arr.length-1; i>=0; i--) {
			result[i] *= r;
			r *= arr[i];
		}	
		System.out.print(Arrays.toString(result));
	}
}
