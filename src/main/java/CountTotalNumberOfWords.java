import java.util.Scanner;

public class CountTotalNumberOfWords {
    public static void main(String args[]){
        int count = 0;
        System.out.println("Enter a sentence :");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        for (int i=0 ; i<sentence.length(); i++){
            char ch = sentence.charAt(i);


            if(ch == ' ' ){
               System.out.print("");
                count++;;
            } else if(ch != ' '){
                count++;
            }
        }
        System.out.println("Number of word in the given sentence is "+count);
    }
}
