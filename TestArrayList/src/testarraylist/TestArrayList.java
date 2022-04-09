package testarraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {

    public static void main(String[] args) {
        //Creating arraylist
        ArrayList<Integer> number = new ArrayList<>();
        //to check size
        System.out.println("Array size is "+ number.size());
        // Add numbers
        number.add(10);
        number.add(20);
        number.add(30);
        // print arraylist
        System.out.println(number);
        
        System.out.println("Array size is "+ number.size());
        // another way to add arraylist
        number.add(3, 40);
        number.add(4, 60);
        number.add(0, 50);
        
        // another way to print Arraylist
        for(int num : number){
            System.out.print(num + " ");
        }
        System.out.println("");
        // another way to print ArrayList
        
       Iterator itr= number.iterator();
       while(itr.hasNext()){
           System.out.print(itr.next() + " ");
       }
       
    }

}
