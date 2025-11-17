
package listexample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Chocolate");
        list.add("coke");
        list.add("chips");
        list.add("sprite");
        
        //print list using enhanced for loop
        for(String s: list){
            System.out.println(s);
        }
        //add element at psition 2
        list.add(2, "Juice");
        System.out.println("Updated list: "+ list);
        //find element in index 3
        System.out.println("Element at index 3 is: "+ list.get(3));
        System.out.println("Find coke is in the list or not: "+ list.contains("coke"));
        
        // remove chocolate from the list
        list.remove("Chocolate");
        System.out.println("Updated list: "+list);
        //arrange list in alphabetic order
        Collections.sort(list);
        System.out.println("List after sorting: "+ list);
        //reverse list
        Collections.shuffle(list);
        System.out.println("List after shuffle: "+ list);
        list.add("coke");
        list.add("coke");
        System.out.println("Occurance of coke: "+ Collections.frequency(list, "coke"));
        
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        int[] number = {3,4,5,343,23};
        
        for(int i=0; i<number.length; i++){
            list1.add(number[i]);
        }
        System.out.println("List1 is: "+ list1);
        System.out.println("Max value in the list: "+ Collections.max(list1));
        System.out.println("Max value in the list: "+ Collections.min(list1));
        
        
    }
    
}
