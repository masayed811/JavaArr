import java.util.ArrayList;

public class CompareTwoArrayLists {
    public static void main(String[] args) {
        ArrayList<String> al= new ArrayList<String>();
        al.add("sayed");
        al.add("Raj");
        al.add("baz");
        al.add("java");
        al.add("selenium");

        ArrayList<String> al2= new ArrayList<String>();
        al2.add("Red");
        al2.add("sayed");
        al2.add("Raj");
        al2.add("java");
        al.add("selenium");

        //Storing the comparison output in ArrayList<String>
        ArrayList<String> al3 = new ArrayList<String>();
        for (String e : al)
            al3.add(al2.contains(e) ? "Yes" : "No");
        System.out.println(al3);
}}
