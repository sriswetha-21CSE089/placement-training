/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		loanaccount l=new loanaccount("xxx",5000);
		l.withdraw(2000);
		l.checkbalance();
	}
}
interface bank{
    public void deposit(int amt);
    public void withdraw(int amt);
    public void checkbalance();
}
class savingsaccount implements bank{
    String name;
    int balance;
    savingsaccount(String n,int b){
        name=n;
        balance=b;
    }
    public void deposit(int amt){
        balance+=amt;
    }
    public void withdraw(int amt){
        if(amt<=balance){
            balance-=amt;
        }
        else{
            System.out.println("balance is low");
        }
    }
    public void checkbalance(){
        System.out.println(balance);
    }
}
class loanaccount extends savingsaccount{
    loanaccount(String n,int b){
        super(n,b);
    }
}
class checkingaccount extends savingsaccount{
     checkingaccount(String n,int b){
        super(n,b);
    }
}