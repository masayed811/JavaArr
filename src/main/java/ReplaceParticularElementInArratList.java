import java.util.ArrayList;

public class ReplaceParticularElementInArratList {
    public static void main(String a[]){
        ArrayList<String> al = new ArrayList<String>();

        //Adding elements to the ArrayList
        al.add("Java");
        al.add("Selenium");
        al.add("school");
        al.add("Home");
        System.out.println("ArrayList: "+al);

        ArrayList<String> al2 = (ArrayList<String>)al.clone();


        //add and remove on original ArrayList
        al.add("University");
        al.remove("Home");

        //Display of both ArrayLists after add & remove
        System.out.println("Replace Element ArrayList:"+al);

    }
}
