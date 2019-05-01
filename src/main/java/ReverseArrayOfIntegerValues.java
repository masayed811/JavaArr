import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayOfIntegerValues {
    //function reverses the elements of the array
    static void reverse(Integer a[])
    {
        Collections.reverse( Arrays.asList(a));
        System.out.print(Arrays.asList(a));
    }

    public static void main(String[] args)
    {
        Integer arr[] = {100, 207, 3,9,88,2, 40, 500};
        reverse(arr);
    }
}

