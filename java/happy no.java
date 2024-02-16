/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    static int method(int n){
        int digit=0,rem;
         while(n>0){
		    rem=n%10;
		    digit=digit+(rem*rem);
		    n/=10;
		  }
		  return digit;
    }
	public static void main(String[] args) {
	    Scanner o=new Scanner(System.in);
	    int result;
		System.out.println("enter number:");
		int n=o.nextInt();
		int temp=n;
		result=method(n);
		while(result!=1||result!=4){
		    if(result==1){
		    System.out.println("true");
		    break;
		   }
		   else if(result==4){
		       System.out.println("false");
		       break;
		   }
		   else{
		       result=method(result);
		       System.out.println(result);
		   }
		    
		}
		    
		
	
		   
	
	}
}
