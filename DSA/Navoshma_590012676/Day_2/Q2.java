public class LargestElement {
    public static int findLargestElement(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty.");
        }

        int max = arr[0]; 

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; 
            }
        }
        
        return max;
    }

    public static void main(String[] args) {
        int[] arr1 = {12, 35, 1, 10, 34, 1};
        System.out.println("Largest element: " + findLargestElement(arr1)); 

        int[] arr2 = {10, 5, 10};
        System.out.println("Largest element: " + findLargestElement(arr2)); 
    }
}
