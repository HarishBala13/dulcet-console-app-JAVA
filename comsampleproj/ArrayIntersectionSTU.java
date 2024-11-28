package comsampleproj;
public class ArrayIntersectionSTU {
	public static void main(String args[]) {
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {4,5,6,7};
		int arr3[] = new int[arr1.length+arr2.length];
		int k=0;
		int l=0;
		for(int i=0; i<arr1.length; i++) {
			arr3[k++] = arr1[i];
		}
		for(int j=arr1.length; j<(arr1.length+arr2.length); j++) {
			arr3[j] = arr2[l++];
		}
		for(int m=0; m<(arr1.length+arr2.length); m++) {
			System.out.print(arr3[m]+", ");
		}
	}
}
