package collections;

import java.util.ArrayList;
import java.util.List;

public class example {
    public static void main(String[] args) {
        List<String> firstList = new ArrayList<>();
        firstList.add("Sonu");
        firstList.add("kanu");
        firstList.add("manu");
        firstList.add("chotu");
        firstList.add("");

        System.out.println("Array List : "+firstList);
        List<String> secondList = new ArrayList<>(firstList);
        System.out.println("Second List :"+secondList);
        System.out.println("\nSize of firstList : " + firstList.size());
        System.out.println("Size of Second list : " + secondList.size());
        firstList.set(0,"monu");
        System.out.println("\nupdated firstlist after set index 0 :"+firstList);
        System.out.println("\nIndex 1 of first list :"+firstList.get(1));
        firstList.remove(1);
        System.out.println("\nFirst List after remove index 1 :"+firstList);
        System.out.println("\nis kanu present in first list :"+ firstList.contains("kanu"));
        System.out.println("\nindex of Sonu in second list :"+secondList.indexOf("Sonu"));
        System.out.println("\nAfter remove from second list"+firstList.removeAll(secondList));

        secondList.sort(String::compareTo);
        System.out.println("\nAfter Sorting second list:"+secondList);
        System.out.println("\ncheck if firstlist is empty :"+firstList.isEmpty());
        System.out.println("\nSize of firstList : " + firstList.size());
        System.out.println("\nSize of Second list : " + secondList.size());
        System.out.println("\nboth list after opeartions :\n"+firstList);
        System.out.println(secondList);
        firstList.clear();
        firstList.add("");
        System.out.println("list="+firstList);
        System.out.println("first is empty?"+firstList.isEmpty());
        System.out.println("size of first list :"+firstList.size());
    }
}
