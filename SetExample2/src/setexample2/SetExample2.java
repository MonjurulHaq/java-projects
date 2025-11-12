package setexample2;

import java.util.HashSet;
import java.util.Set;

public class SetExample2 {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(44);
        set1.add(34);
        set1.add(76);
        System.out.println("Elements fo set1 is: "+set1);
        
        //create another set
        Set<Integer> set2 = new HashSet<Integer>();
        set2.add(65);
        set2.add(34);
        set2.add(23);
        System.out.println("Elements fo set2 is: "+set2);
        
        //union of two sets
        //set2.addAll(set1);
        //System.out.println("Union of two sets: "+set2);
        
        //intersection of two sets
        set2.retainAll(set1);
        System.out.println("Intersection result is: "+set2);
        
        //insert elements using loop
        AddDataUsingLoop ob = new AddDataUsingLoop();
        ob.addData();
 
    }
    
}

class AddDataUsingLoop{
    public void addData(){
        int[] number = {12,23,43,54};
        Set<Integer> set1 = new HashSet<Integer>();
        for(int i = 0; i<number.length; i++){
            set1.add(number[i]);
        }
        System.out.println("Elments of set is: "+set1);
    }
}