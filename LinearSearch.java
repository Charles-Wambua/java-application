public class LinearSearch {

    
    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; 
            }
        }
        return -1;
    }

    public static void main(String[] args) {
     
        int[] array = {10, 5, 7, 2, 15};
        int targetElement = 7;

      
        int result = linearSearch(array, targetElement);

    
        if (result != -1) {
            System.out.println("Element " + targetElement + " found at index " + result);
        } else {
            System.out.println("Element " + targetElement + " not found in the array");
        }
    }
}
