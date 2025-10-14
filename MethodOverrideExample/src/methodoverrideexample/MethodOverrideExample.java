
package methodoverrideexample;

public class MethodOverrideExample {
    public static void main(String[] args) {
        Figure ob = new Figure(5.0,6.0);
        ob.Area();
        Rectangle ob2 = new Rectangle(5.8,5.6);
        ob2.Area();
        Triangle ob3 = new Triangle(5.8,5.6);
        ob3.Area();
        
    }
    
}
