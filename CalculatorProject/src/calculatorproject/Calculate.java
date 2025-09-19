package calculatorproject;
public class Calculate {
    int x, y;
    public Calculate(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int addNumber(){
        int sum = x+y;
        return sum;
    }
    public int subtractNumber(){
        int sub = Math.abs(x - y);
        return sub;
    }
    public int multiplyNumber(){
        int multiply = x*y;
        return multiply;
    }
    public int divisionNumber(){
        int division = x/y;
        return division;
    }



    
}