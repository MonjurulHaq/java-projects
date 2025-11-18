
package hashmapexample;
import java.util.*;

public class HashMapExample {

    public static void main(String[] args) {
        //create a hashmap: <key, value>
        HashMap<Integer, String> myMap = new HashMap<Integer, String>();
        //is hashMap empty
        System.out.println("Is empty: "+myMap.isEmpty());
        //add elements
        myMap.put(1, "OOP");
        myMap.put(2, "Data Science");
        myMap.put(3, "Artifical Inteligence");
        //print
        System.out.println(myMap);
        //search value using key
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a key to search: ");
        int search= s.nextInt();
        //get method is used to search value using key
        String value = myMap.get(search);
        System.out.println("Search value is: "+value);
        //print all key values
        System.out.println("Keys: "+myMap.keySet());
        //print all values
        System.out.println("Values: "+myMap.values());
        //return hashset of key/value
        System.out.println("Key/value mapping: "+myMap.entrySet());
        //replace
        myMap.replace(2, "Generative AI");
        System.out.println(myMap);
        //delet element from list
        myMap.remove(1);
        System.out.println(myMap);
    }
    
}
