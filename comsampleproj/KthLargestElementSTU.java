package comsampleproj;
public class KthLargestElementSTU {
	public static void main(String args[]) {
		int[] arr = {3,2,1,5,6,4};
		int n = arr.length;
		int temp = 0;
		int k = 2;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(arr[n-k]);
	}
}
