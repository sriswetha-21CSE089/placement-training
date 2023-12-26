/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner o=new Scanner(System.in);
		System.out.println("enter n1:");
		int n1=o.nextInt();
		System.out.println("enter n2:");
		int n2=o.nextInt();
		if(n2==0){
		    	System.out.println("you cannot perform division");
		}
		System.out.println("enter operator:");
		char op=o.next().charAt(0);
		//System.out.println(op);
		if(op=='+')
		{
		     System.out.println(n1+n2);
		}
		 
		else if(op=='-'){
		     System.out.println(n1-n2);
		}
		 
		else if(op=='*'){
		    System.out.println(n1*n2);
		}
		  
		else if(op=='/'){
		    System.out.println(n1/n2);
		}
		  
		else{
		    System.out.println("enter valid operation");
		}
		   
	}
}
