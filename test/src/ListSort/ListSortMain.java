package ListSort;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListSortMain {	 
    public static void main(String[] args) {
        ArrayList<Integer> foo = new ArrayList<>();
        
        foo.add(10);
        foo.add(30);
        foo.add(5);
        foo.add(2);
        foo.add(11);
        foo.add(90);
         
        Collections.sort(
            foo, 
            new Comparator<Integer>() {
                @Override
                public int compare(Integer obj1, Integer obj2) {
                    return obj1 - obj2;
                }
            }
        );
        
        System.out.println(foo);
    }
 
}
