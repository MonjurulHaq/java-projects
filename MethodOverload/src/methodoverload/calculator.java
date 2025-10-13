package methodoverload;


public class calculator {
    //method overloading using number of parameter
    public void sum(int x, int y){
        int total = x+y;
        System.out.println("Sum of two integer: " + total);
    }
    public void sum(int x, int y, int z){
        int total = x+y+z;
        System.out.println("Sum of three integer: " + total);
    }
    //method overloading using data types of parameter
    public void sum(float x, float y){
        float total = x + y;
        System.out.println("Sum of two float: "+ total);
    }
    public void sum(double x, double y){
        double total = x + y;
        System.out.println("Sum of two double : "+ total);
    }
    //method overloading using data sequence of data types of parameter
    public void sum(float x, double y){
        double total = x + y;
        System.out.println("Sum of float and double : "+ total);
    }
    public void sum(double x, float y){
        double total = x + y;
        System.out.println("Sum of double and float : "+ total);
    }
    
}
