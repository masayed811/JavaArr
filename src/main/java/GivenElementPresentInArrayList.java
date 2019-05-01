import java.util.ArrayList;
import java.util.Scanner;

public class GivenElementPresentInArrayList {
    public static void main(String[] args) {

        // creating an Empty String ArrayList
        ArrayList<String> arr = new ArrayList<String>();

        // using add() to initialize values

        arr.add( "sayed" );
        arr.add( "Raz" );
        arr.add( "Muhammod" );
        arr.add( "pagol" );
        arr.add( "Mad" );
        arr.add( "Friend" );
        System.out.println("ArrayList: "+arr);
        // use contains() to check if the element
        // "geeks" exits or not
        String element;
        Scanner s = new Scanner( System.in );
        System.out.print( "Enter elements you want check:" );
        element = s.next();

        boolean ans = arr.contains( element );

        if (ans)
            System.out.println( "The list contains :" + element );
        else
            System.out.println( "The list does not contains :" + element );

    }
}