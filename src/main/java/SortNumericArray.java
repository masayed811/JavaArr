import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.reverseOrder;

public class SortNumericArray {
    public static void main(String[] args) {
        // array contains 15 element.

        int arr[]={89,90,33,68,12,5,9,3,1,10,20,100,50,25,75};

        // sort with acesnding order
        Arrays.sort(arr);

        System.out.printf("Result :%s",
                Arrays.toString(arr));
// Sorts arr[] in descending order



        // String arrays sort


        String a[] = {"Md sayed",
                "Abu sayedg",
                "Brother sayeed","Sayed Ali","Sayed swapan",};
        Arrays.sort(a);


        // Sorts a[] in ascending order
        Arrays.sort(a);
        System.out.printf("Sort string ascending order: \n%s\n\n",
                Arrays.toString(a));

        // Sorts a[] in descending order
        Arrays.sort(a, reverseOrder());

        System.out.printf("Sort string descending order: \n%s\n\n",
                Arrays.toString(a));
    } }