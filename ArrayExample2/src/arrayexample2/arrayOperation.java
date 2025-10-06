
package arrayexample2;

import java.util.Scanner;

public class arrayOperation {
    int total = 0;
    int marks[]= new int[10];
    Scanner s = new Scanner(System.in);
    
    public void getValue(){
        System.out.println("Enter 10 values: ");
        for(int i=0; i<marks.length; i++){
            marks[i]= s.nextInt();
        }
    }
    public void printArray(){
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
    }
    public void findTotal(){
        for(int i=0; i<marks.length; i++){
            total += marks[i];
        }
        System.out.println("Total is: "+total);
    }
    public void findMax(){
        int max = marks[0];
        for(int i = 1; i<marks.length; i++){
            if(marks[i]>max){
                max = marks[i];
            }
        }
        System.out.println("Maximum value is: "+max);
    }
    public void searchElement(){
        int i;
        System.out.println("Enter value to search: ");
        int searchFor = s.nextInt();
        boolean foundIt = false;
        for(i=0; i<marks.length; i++){
            if(marks[i]==searchFor){
                foundIt = true;
                break;
            }
        }
        if(foundIt==true){
            System.out.println(searchFor + "found at position "+ i);
        }else{
            System.out.println(searchFor + "is not found");
        }
    }
}
