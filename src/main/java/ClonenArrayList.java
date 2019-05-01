import java.util.ArrayList;

public class ClonenArrayList {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add( "ma" );
        al.add( "sayed" );
        al.add( "abu" );
        al.add( "selenium" );
        al.add( "java" );
        System.out.println( "Original array list: " + al );
        ArrayList<String> newal = (ArrayList<String>) al.clone();
        System.out.println( "Cloned array list: " + newal);
    }
}