package comsampleproj;

public class DuplicatesArray {
public static void main(String args[]) {
	int arr1[]= {1,2,3,4,5};
	int arr2[]= {4,5,6,7};
	int k=0;
	int arr3[]= new int[arr2.length];
	for(int i=0;i<arr1.length;i++) {
		for(int j=0;j<arr2.length;j++) {
			if(arr1[i]==arr2[j]) {
				arr3[k++]=arr1[j];
			}
		}
	}
	for(int i=0;i<k;i++) {
		System.out.print(arr3[i]);
	}
}
}
