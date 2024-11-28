package comsampleproj;

public class PairsMatchingSum {
	public static void main(String args[]) {
		int[] arr = {1,4,5,3,2};
		int sum = 6;
		int k=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] + arr[k] == sum) {
				System.out.print(arr[i]+","+arr[k]);
				k++;
			}
			System.out.println();
		}
	}

}
