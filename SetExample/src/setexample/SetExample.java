
package setexample;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        Set<Integer> set1= new HashSet<Integer>();
        set1.add(32);
        set1.add(43);
        set1.add(54);
        set1.add(65);
        System.out.println("Elements of set1 is: "+set1);
        System.out.println("Hashcode of set1 is: "+set1.hashCode());
        System.out.println("Size of set1 is: "+set1.size());
        System.out.println("Search value of 43 in set1 is: "+set1.contains(43));
        set1.remove(43);
        System.out.println("Elements of set1 is: "+set1);
        System.out.println("Size of set1 is: "+set1.size());
    }
    
}
