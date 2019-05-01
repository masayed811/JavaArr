import java.util.Arrays;

public class InsertElementInArray {


    public static void main(String[] args) {

        int arr[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        // Insert an element in 3rd position of the array (index->2, value->5)

        int Index_position = 2;
        int newValue    = 5;

        System.out.println("Original Array : "+ Arrays.toString(arr));

        for(int i=arr.length-1; i > Index_position; i--){
            arr[i] = arr[i-1];
        }
        arr[Index_position] = newValue;
        System.out.println("New Array: "+Arrays.toString(arr));
    }
}

