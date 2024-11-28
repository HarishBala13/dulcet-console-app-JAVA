package comsampleproj;
public class Segregate0and1STU {
	public static void main(String args[]) {
		int[] a = {0,1,0,1,1,0};
		int n=a.length;
		int size = n-1;
		int k=0;
		for(int i=0; i<n; i++) {
			if(a[i]==0) 
				a[k++] = a[i];
			else if(a[i]==1)
				a[size--] = a[i];
		}
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+", ");
		}
	}
}
