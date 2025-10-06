package arrayexample;

public class ArrayExample {

    public static void main(String[] args) {
       int arr[]  = {3,4,3,23};
       int arr1[] = new int[10];
       float[] arr2 = {45.45f,45.45f,45.4f};
       char ch[]= {'a','b','c'};
       String str[] = {"name","name3"};
        System.out.println("Length: "+ arr.length);
        
        String[][] names={
            {"mr.", "Mrs","Ms."},
            {"Smith","Jon"}
    };
        System.out.println(names[0][0] + names[1][0]);   
    }
    
}
