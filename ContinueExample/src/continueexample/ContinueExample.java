package continueexample;

import java.util.Scanner;

public class ContinueExample {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double number, sum = 0.0;
        for(int i=1; i<=6; i++){
            System.out.println("Enter number "+i+ " :");
            number = s.nextDouble();
            if(number<=0.0){
                continue;
            }
            sum = sum+number;
        }
        System.out.println("Total is: "+sum);
    }
    
}
