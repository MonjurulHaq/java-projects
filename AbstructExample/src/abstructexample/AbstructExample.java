package abstructexample;

abstract class Figure {
    double dim1, dim2;
    Figure(double dim1, double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    public abstract void Area();
   
}
class Rectangle extends Figure{
    //constructor method
    Rectangle(double d1, double d2){
        //this.dim1 = d1;
        //this.dim1 = d1;
        super(d1,d2);
    }
    //override area method
    public void Area(){
        double result = dim1*dim2;
        System.out.println("Area of rectangle is: "+result);
    }
    
}
class Triangle extends Figure {
    //constructor
    Triangle(double d1, double d2){
        super(d1, d2);
    }
    public void Area(){
        double result = (dim1*dim2)/2;
        System.out.println("Area of triangle is: "+ result);
    }
}
public class AbstructExample {

    public static void main(String[] args) {
        //Figure ob = new Figure(5.0,6.0);
        //ob.Area();
        Rectangle ob2 = new Rectangle(5.8,5.6);
        ob2.Area();
        Triangle ob3 = new Triangle(5.8,5.6);
        ob3.Area();
    }
    
}
