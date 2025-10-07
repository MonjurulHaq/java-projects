package twodarrayexample;

import java.util.Scanner;

public class TwoDArrayExample {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [][] matrix = new int [3][4];
        System.out.println("Enter "+ matrix.length + " rows and "+matrix[0].length + " columns" );
        for (int row=0; row<matrix.length; row++){
            for(int column=0; column<matrix[row].length;column++){
                matrix[row][column]=s.nextInt();
            }
        }
        for (int row=0; row<matrix.length; row++){
            for(int column=0; column<matrix[row].length;column++){
                System.out.print( matrix[row][column] + " ");
            }
            System.out.println();
        }
        //calculate sum of all elements
        System.out.println("\nSum of all elements is: " + sum(matrix));
        System.out.println("no of 1 is: "+ countNumber(matrix));
    }
    //Create user defined function: sum
    public static int sum(int[][] matrix){
    int total = 0;
    for (int row=0; row<matrix.length; row++){
        for(int column=0; column<matrix[row].length; column++){
            total += matrix[row][column];
        }
    }
    return total;
}
    public static int countNumber(int[][] matrix){
      int count = 0; 
      for (int row=0; row<matrix.length; row++){
        for(int column=0; column<matrix[row].length; column++){
            if(matrix[row][column]==1){
                count++;
            }
        }
    }
    return count;
    }
    
    
}
