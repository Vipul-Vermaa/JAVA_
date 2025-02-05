package Task2;

//question 3

public class Account {
    private double balance;

    public Account(){
        this.balance=0.0;
    }

    public Account(double balance){
        this.balance=balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("amount deposited: "+amount);
        }else{
            System.out.println("error");
        }
    }

    public void withdraw(double amount){
        if(amount >0 && amount<=balance){
            balance-=amount;
            System.out.println("amount withdrawn: "+amount);
        } else if (amount>balance) {
            System.out.println("insufficient");
        } else {
            System.out.println("error");
        }
    }

    public void displayBalance(){
        System.out.println("available balance: "+balance);
    }

    public static void main(String[] args){
        Account acc1=new Account();
        acc1.displayBalance();

        acc1.deposit(500);
        acc1.withdraw(350);
        acc1.displayBalance();
        System.out.println();
    }
}
