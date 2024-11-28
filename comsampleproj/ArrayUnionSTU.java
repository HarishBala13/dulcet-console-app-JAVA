package comsampleproj;
public class ArrayUnionSTU {
	public static void main(String args[]) {
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {3,4,5,6};
		int n = arr1.length + arr2.length;
		int[] arr3 = new int[n];
		int k = 0;
		for(int i=0; i<arr1.length; i++) {
			arr3[i] = arr1[i]; 
		}
		for(int j=arr1.length; j<n; j++) {
			arr3[j] = arr2[k++];
		}
		for(int l=0; l<n; l++) {
			for(int h=l+1; h<n; h++) {
				if(arr3[h] == arr3[l]) {
					arr3[l]=-1;
				}
			}
		}
		for(int m=0; m<n; m++) {
			if(arr3[m]>0)
				System.out.print(arr3[m]+", ");
		}
	}
}
