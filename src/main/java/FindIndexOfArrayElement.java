import java.util.Scanner;

public class FindIndexOfArrayElement {
    public static int findIndex (int [] arr, int t)
    { if (arr == null)
        return -1;
        for (int i =0; i< arr.length; i++)
            if (arr [i]==t)
                return i;
        return -1;
    }
    public static void main(String[] args) {
        int [] my_array = {2,45,6,8,9,25, 14, 56, 15, 36, 56, 77, 18, 29, 49,100,2019};

        Scanner input = new Scanner (System.in);

        int [] testNumber= new int [2];
        for (int d = 0; d< testNumber.length; d++){ //creating an array to input numbers, using Scanner
            System.out.println ("Input the number you want to test: ");
            testNumber [d] = input.nextInt();
            int a = testNumber[d];
            int b = findIndex (my_array, a);
            if (b==-1){
                System.out.println("does not exist");} else{
                System.out.println("Index number of "+ a+ " is "+ b);}
        }
    }
}
