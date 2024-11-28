package comsampleproj;
public class MissingNumberArraySTU {
	public static void main(String args[]) {
		int[] a= {1,2,4,5};
		int n = a.length+1;
		int i,total_N;
		total_N = n *(n+1)/2;
		System.out.println(total_N);
		int sum = 0;
		for(i=0; i<a.length; i++) {
			sum+=a[i];
		}
		int missing_number = total_N - sum;
		System.out.print(missing_number);
	}
}
