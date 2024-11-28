package comsampleproj;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 4, 1, 5, 9, 2 };
        int n = arr.length;

        int[] stack = new int[n];
        int top = -1;

        stack[++top] = 0;
        stack[++top] = n - 1;

        while (top >= 0) {
            int high = stack[top--];
            int low = stack[top--];

            int pivot = arr[high];
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (arr[j] < pivot) {
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;

            int p = i + 1;
            if (p - 1 > low) {
                stack[++top] = low;
                stack[++top] = p - 1;
            }

            if (p + 1 < high) {
                stack[++top] = p + 1;
                stack[++top] = high;
            }
        }
        
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]+", ");
        }

//        System.out.println(Arrays.toString(arr));
    }
}

