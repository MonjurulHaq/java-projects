package ifelsedemo;

import javax.swing.JOptionPane;

public class findMaxMin {
    int x, y, z;
    public findMaxMin(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void findMax(){
        int max = x;
        if(y>max){
            max = y;
        }
        if(z>max){
            max = z;
        }
        JOptionPane.showMessageDialog(null, max);
    }
    public void findMin(){
        int min = x;
        if(y<min){
            min = y;
        }
        if(z<min){
            min = z;
        }
        JOptionPane.showMessageDialog(null, min);
    }
}
