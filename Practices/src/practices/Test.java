package practices;

public class Test {

    public static void main(String[] args) {
        
        int[] oldList = {1, 2, 3, 4, 5};
        reverse(oldList);
        for (int i = 0; i < oldList.length; i++) {
            System.out.print(oldList[i] + " ");
        }
        System.out.println();
       
    }
    
    

    public static void reverse(int[] list) {
        int[] newList = new int[list.length];

        for (int i = 0; i < list.length; i++) {
            newList[i] = list[list.length - 1 - i];
                     System.out.print(newList[i] + " ");

            
        }

        list = newList;
    }
}



