package comsampleproj;
public class AllPairsGivenSum {
	public static void main(String args[]) {
		int[] a = {1,3,2,4,5};
		int n = a.length;
		int sum = 6;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(a[i]+ a[j] == sum)
					System.out.print(a[i]+","+a[j]);
			}
		}
	}
}
