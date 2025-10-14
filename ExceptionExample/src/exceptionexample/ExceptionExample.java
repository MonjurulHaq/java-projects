package exceptionexample;

import java.util.Scanner;

public class ExceptionExample {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        double num1 = s.nextInt();
        double num2 = s.nextInt();
        try{
        double result = num1 / num2;
        System.out.println("Result is: "+ result);
        }catch(Exception e){
            System.out.println("You can't divide any number by zero");
        }
    }
    
}
