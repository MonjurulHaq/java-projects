package switchexample;

import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {
        char ch;
        do{
            
        
        Scanner s = new Scanner(System.in);
        int num1, num2, choice;
        System.out.println("Enter two numbers");
        num1 = s.nextInt();
        num2=s.nextInt();
        System.out.println("1. for addition\n 2. for subtraction \n3. for multiplication");
        System.out.println("Enter your choice: ");
        choice = s.nextInt();
        
        switch(choice){
            case 1:
                int total = num1+num2;
                System.out.println("Total is: "+total);
                break;
            case 2:
                int difference = num1-num2;
                System.out.println("Difference is: "+difference);
                break;
            case 3:
                int multiplication = num1*num2;
                System.out.println("Multiplication is: "+multiplication);
                break;
            default:
                System.out.println("Wrong choice");
        }
        System.out.println("Want to continue(Y/N)? ");
        ch = s.next().charAt(0);
        }while((ch=='y')||(ch=='Y'));
    }
    
}
