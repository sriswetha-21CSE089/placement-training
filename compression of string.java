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
	    int count=1,i=0;
		System.out.println("enter string:");
		Scanner o=new Scanner(System.in);
		String str=o.next();
		while(i<str.length()){
		    
		    while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
		        count+=1;
		        i++;
		    }
		    if(count>1){
		        System.out.print(str.charAt(i)+""+count);
		    }
		    else{
		        System.out.print(str.charAt(i));
		    }
		    i++;
		    count=1;
		}
		
	}
}
