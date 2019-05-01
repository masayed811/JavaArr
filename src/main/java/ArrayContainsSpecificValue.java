import java.util.Scanner;

public class ArrayContainsSpecificValue {

    public static void main(String[] args) {
        System.out.print( " Enter Value for check : " );
        Scanner scan = new Scanner( System.in );
        int value = scan.nextInt();
        int array[] = {1, 5, 7, 9, 7, 1000, 2828, 737, 3000, 592, 56, 88, 99,1947,2020,2018,2019};
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i] == value) {
                System.out.print( "\nYes, " + value + " is in this array." );
                break;


            }
        }
        if
        ((array.length) - i == 0) {
            System.out.print( "\nNo, " + value + " is not in this array." );

        }
    }}
