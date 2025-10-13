
package inheritanceexample;
class A{
    int num1;
    private int k;
    protected int p;
}
class B extends A{
    int num2;
    public void printP(){
        System.out.println(p);
    }
    public void sum(){
       int total = num1+num2;
       System.out.println("Sam is: "+ total);
    }
}
public class InheritanceExample {
    public static void main(String[] args) {
        A ob = new A();
        ob.p=10;
        System.out.println("value of p is: "+ ob.p);
        
        B ob1 = new B();
        ob1.sum();
        ob1.printP();
    }
    
}
