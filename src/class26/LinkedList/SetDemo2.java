package class26.LinkedList;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo2 {
    public static void main(String[] args) {
        LinkedHashSet<String> hashSet= new LinkedHashSet<>();  //it keeps printing elements in order(mantains order)
        hashSet.add("Apples");
        hashSet.add("Mango");
        hashSet.add("Kiwi");
        hashSet.add("Apples");
        hashSet.add("Apples");
        System.out.println(hashSet);
    }

}
