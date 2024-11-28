package comsampleproj;
public class SubArrayGivenSumSTU {
	public static void main(String args[]) {
	int[] arr = {1,2,3,7,5};
	int n = arr.length;
	int sum = 12;
	int start = 0;
	int current = arr[0];
	  for (int end=1; end<=n; end++) {
            while (current>sum && start<end - 1) {
                current -= arr[start];
                start++;
            }
            if (current == sum) {
                for (int i=start; i<end; i++) {
                    System.out.print(arr[i]+", ");
                }
                return;
            }
            if (end<n) {
                current += arr[end];
            }
        }
    }
}