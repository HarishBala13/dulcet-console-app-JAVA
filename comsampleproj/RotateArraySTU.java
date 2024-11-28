package comsampleproj;

public class RotateArraySTU {
	public static void main(String args[]) {
		int[] arr = {1,2,3,4,5};
		int steps = 2;
		steps+=1;
		for(int i=steps;i<arr.length;i++) {
			System.out.print(arr[i]+", ");
		}
		for(int i=0;i<steps;i++) {
			System.out.print(arr[i]+", ");
		}
		
	}
}
