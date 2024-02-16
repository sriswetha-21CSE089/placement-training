/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		
		int a[]={2,3,1,1,4};
		int last=a.length-1;
		int fur=0;
		for(int i=a.length-2;i>=0;i--){
		    fur=a[i]+i;
		    if(fur>=last)
		       last=i;
		}
		if(last==0)
		  System.out.println("true");
		else
		  System.out.println("false");
	}
}
