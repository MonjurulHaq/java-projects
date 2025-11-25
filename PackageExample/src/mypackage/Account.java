
package mypackage;


public class Account {
    public double balance = 1000.90;
    public void deposit(double amount){
        balance = balance + amount;
    }
    public void showBalance(){
        System.out.println("Balance is: "+balance);
    }
}
