package LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Demo2 {
    public static ArrayList<Integer> array = new ArrayList<>();
    public static LinkedList<Integer> linkedArr = new LinkedList<>();
    public static LinkedList<Integer> clonedArr = new LinkedList<>();

    public static void main(String[] args) {
        linkedArr.add(1);
        linkedArr.add(2);
        linkedArr.add(2);
        linkedArr.add(3);
        linkedArr.add(4);
        linkedArr.add(5);
        linkedArr.add(6);
        linkedArr.push(1);
        clonedArr = (LinkedList) linkedArr.clone();
        linkedArr.iterator().hasNext();
        System.out.println(linkedArr.getLast());
        System.out.println(linkedArr);
        clonedArr.addFirst(3);
        System.out.println(clonedArr);
        Iterator it = linkedArr.iterator();
        int count = 0;
        while (it.hasNext()) {
            if ((int) it.next() == 3) {
                System.out.println("3 was found" + count);
                return;
            } else {
                count++;
            }
        }
    }
}
