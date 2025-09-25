package nestedforloop;

public class NestedForLoop {

   
    public static void main(String[] args) {
        for(int i= 1; i<=7; i++){
            //inner loop
            for(int j = 1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
    
}
