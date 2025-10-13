
package methodoverload;


public class MethodOverload {

    public static void main(String[] args) {
        calculator ob = new calculator();
        //method overloading using number of parameter
        ob.sum(345, 9872);
        ob.sum(47835, 4329875, 984037);
        
        //method overloading using data types of parameter
        ob.sum(54.4f, 5.45f);
        ob.sum(544.4, 435.45);
        
        //method overloading using data sequence of data types of parameter
        ob.sum(545.5f, 83475.45);
        ob.sum(3654.435, 894.45f);
    }
    
}
