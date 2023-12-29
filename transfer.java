/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		account a=new account("xxx",12344,5000);
		account b=new account("yyy",34555,2500);
		if(a.transfer(b,1500)){
		    a.display();
		    b.display();
		}
		if(b.transfer(a,3000)){
		     b.display();
		      a.display();
		}
	}
}
class account{
    String name;
    int id;
    int balance;
    account(String n,int id,int b){
        name=n;
        this.id=id;
        balance=b;
    }
    boolean transfer(account other,int amt){
        if(amt<=balance){
            this.balance-=amt;
            other.balance+=amt;
            return true;
        }
        else{
            return false;
        }
        
    }
    void display(){
        System.out.println("Name:"+this.name);
         System.out.println("Account id:"+this.id);
          System.out.println("balance amount:"+this.balance);
    }

}
