package testarraylist;

import java.util.ArrayList;

public class MethodOfArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //Adding method
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        //removing method
        list.remove(0);
        System.out.println(list);
        
        // isEmpty method
        boolean check = list.isEmpty();
        System.out.println(check);
        System.out.println(list.isEmpty());
        // contains method
        boolean contain = list.contains(30);
        System.out.println(" contains method " + contain);
        System.out.println(list.contains(40));
        //indexOf method returns index no.
        int pos = list.indexOf(40);
        System.out.println("indexOf method "+ pos);
        System.out.println(list.indexOf(40));
        
        // set method works with replace 
        list.set(0, 10);
        System.out.println("set method " + list);
        
        // get method 
        
        int x = list.get(0);
        System.out.println("get method " + x);
        
        
    }

}
