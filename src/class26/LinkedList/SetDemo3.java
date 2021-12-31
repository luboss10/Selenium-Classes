package class26.LinkedList;

import java.util.TreeSet;

public class SetDemo3 {
    public static void main(String[] args) {
        TreeSet<String>treeSet=new TreeSet<>();   //elements will be printed in alfabethic order/numeric order in case of numbers
        treeSet.add("Z");
        treeSet.add("X");
        treeSet.add("Z");
        treeSet.add("A");
        treeSet.add("H");
        System.out.println(treeSet);

    }
}
