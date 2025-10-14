
package methodoverrideexample;

public class Triangle extends Figure {
    //constructor
    Triangle(double d1, double d2){
        super(d1, d2);
    }
    public void Area(){
        double result = (dim1*dim2)/2;
        System.out.println("Area of triangle is: "+ result);
    }
}
