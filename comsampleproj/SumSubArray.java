package comsampleproj;

public class SumSubArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int n = arr.length;
        int sum = 12;

        int start = 0;
        int currentSum = arr[0];

        for (int end = 1; end <= n; end++) {
   
            while (currentSum > sum && start < end - 1) {
                currentSum -= arr[start];
                start++;
            }
            if (currentSum == sum) {
                for (int i = start; i < end; i++) {
                    System.out.print(arr[i]+", ");
                }
                return;
            }
            if (end < n) {
                currentSum += arr[end];
            }
        }
    }
}

