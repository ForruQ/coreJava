
package testarraylist;

import java.util.ArrayList;
import java.util.Collections;


public class SortArrayList {
    public static void main(String[] args) {
        getSort();
    }
    
    public static void getSort(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(20);
        list.add(60);
        list.add(40);
        list.add(50);
        System.out.println("List is " + list);
        
       // arraylist Sort in ascending order
        
        Collections.sort(list);
        System.out.println("Sorted list "+ list);
        // Arraylist sort descending order
        Collections.reverse(list);
        System.out.println("Descending order "+ list);
    }
    
}
