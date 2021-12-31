package class26.LinkedList;

import net.bytebuddy.dynamic.scaffold.MethodGraph;

import java.util.HashSet;
import java.util.LinkedList;

public class SetDemo1 {
    public static void main(String[] args) {

        HashSet<String> hashSet= new HashSet<>(); // HASHSET doesnt print duplicates
        hashSet.add("Apples");
        hashSet.add("Mango");
        hashSet.add("Kiwi");
        hashSet.add("Apples");
        hashSet.add("Apples");
        System.out.println(hashSet);

        LinkedList<String> linkedList= new LinkedList<>();
        linkedList.add("Apples");
        linkedList.add("Mango");
        linkedList.add("Kiwi");
        linkedList.add("Apples");
        linkedList.add("Apples");
        System.out.println(linkedList);



    }
}
