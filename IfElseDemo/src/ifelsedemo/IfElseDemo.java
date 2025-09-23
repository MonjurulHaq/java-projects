package ifelsedemo;

import javax.swing.JOptionPane;

public class IfElseDemo {
    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog(null, "Enter first number: ");
        String s2 = JOptionPane.showInputDialog(null, "Enter second number: ");
        String s3 = JOptionPane.showInputDialog(null, "Enter third number: ");
        
        int x = Integer.parseInt(s1);
        int y = Integer.parseInt(s2);
        int z = Integer.parseInt(s3);
        
        findMaxMin ob = new findMaxMin(x, y, z);
        
        ob.findMax();
        ob.findMin();

        
        
    }
    
}
