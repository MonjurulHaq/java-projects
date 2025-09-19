package calculatorproject;

import javax.swing.JOptionPane;

public class CalculatorProject {

    public static void main(String[] args) {
        String fn = JOptionPane.showInputDialog("Enter First number: ");
        String sn = JOptionPane.showInputDialog("Enter Second number: ");
        int x = Integer.parseInt(fn);
        int y = Integer.parseInt(sn);
        Calculate obj = new Calculate(x, y);
        int a = obj.addNumber();
        int b = obj.subtractNumber();
        int c = obj.multiplyNumber();
        int d = obj.divisionNumber();
        JOptionPane.showMessageDialog(null,"Sumation is: " +a);
        JOptionPane.showMessageDialog(null,"Difference is: " +b);
        JOptionPane.showMessageDialog(null,"Multiplication is: " +c);
        JOptionPane.showMessageDialog(null,"Division is: " +d);
    }
    
}
