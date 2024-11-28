package comsampleproj;

public class AscendingSortingSTU {
	public static void main(String args[]) {
		int[] arr = {3,1,4,1,5,9,2};
		int temp = 0;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i; j<arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=arr[i];
				}
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+", ");
		}
	}

}
