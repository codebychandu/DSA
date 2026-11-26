
/*
Binary Search: This is the type of process through we can find number if array is sorted.

process: by dividing the search in half of the array (divide, compare and move right or left and repeat until you find the exact number)
*/
import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Enter the all Number: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        int result = binary(arr, target);

        if (result != -1) {
            System.out.println("Element found on index: " + result);
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }

    public static int binary(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (mid < target) {
                left = mid + 1;
            } else if (mid > target) {
                right = mid - 1;
            }

        }

        return -1;
    }

}
