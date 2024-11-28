package comsampleproj;
public class DuplicatesArraySTU {
	public static void main(String args[]) {
		int[] arr = {1,2,3,4,5};
		int[] arr1 = {6,7,8,9};
		int[] dup_arr = new int[arr.length];
		int k=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					dup_arr[k++] = arr[i];
				}
			}
		}
		for(int l=0; l<k; l++) {
			System.out.print(dup_arr[l]+", ");
		}
	}
}
