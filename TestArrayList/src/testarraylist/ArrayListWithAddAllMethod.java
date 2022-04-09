package testarraylist;

import java.util.ArrayList;

public class ArrayListWithAddAllMethod {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        System.out.println("list1 " + list1);

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        System.out.println("List2 " + list2);

        list3.addAll(list2);
        System.out.println("list3 after adding all from list2 " + list3);
        System.out.println("equality check between list2 and list3 is " + list3.equals(list2));
        list3.addAll(list1);
        System.out.println("list3 after adding all from list1 " + list3);
        System.out.println("equality check between list2 and list3 is " + list3.equals(list2));

    }

}
