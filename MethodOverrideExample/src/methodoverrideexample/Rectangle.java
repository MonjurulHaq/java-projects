
package methodoverrideexample;

public class Rectangle extends Figure{
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
