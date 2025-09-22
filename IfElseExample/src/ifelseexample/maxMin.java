package ifelseexample;

public class maxMin {
    public void findMax(int x, int y, int z){
        int max =x;
        if(y>max){
            max = y;
        }
        if(z>max){
            max = z;
        }
        System.out.println("Maximum value is: "+max);
    }
    public void findMin(int x, int y, int z){
        int min =x;
        if(y<min){
            min = y;
        }
        if(z<min){
            min = z;
        }
        System.out.println("Minimum value is: "+min);
    }
}
