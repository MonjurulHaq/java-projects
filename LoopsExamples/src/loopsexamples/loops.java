package loopsexamples;
public class loops {
    public void whileLoop(){
        int i = 1;
        int sum = 0;
        while(i<=10){
            sum = sum + i;
            i++;
        }
        System.out.println("Summation using while loop: "+sum);
    }
    public void doWhile(){
        int i = 1;
        int sum = 0;
        do{
            sum = sum+i;
            i++;
        }while(i<=10);
        System.out.println("Summation using do while loop: "+sum);
    }
    public void forLoop(){
        int sum = 0;
        for(int i =1; i<=10; i++){
            sum = sum + i;
        }
        System.out.println("Summation using do while loop: "+sum);
    }
}
