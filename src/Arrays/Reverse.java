package Arrays;

/**
 * Approaches:
 * 1. Create new array and copy elements from end to start - Space O(N) Time O(N)
 * 2. Two pointer approach in place, keep one at first and one at end and then swap the element until end > first
 */
public class Reverse {

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4};
        reverseArr(arr);
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    private static void reverseArr(int[] arr) {

        for (int i = 0, j = arr.length-1 ; j > i ; i++, j--) {
            swap(arr, i, j);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
