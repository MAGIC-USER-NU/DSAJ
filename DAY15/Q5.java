package DAY15;
import java.util.ArrayList;
import java.util.Collections;
public class Q5 {
    public static void main(String[] args) {              //arraylist is wc over array
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println(arr.size());                   //size
        arr.add(10);                                    //add
        System.out.println(arr.size());
        arr.add(20);
        System.out.println(arr.size());
        arr.add(30);
        arr.add(1,30);                      //add at point
        System.out.println(arr.get(3));
        arr.remove(2);
        Collections.sort(arr);
        System.out.println(arr);
    }



    
}
