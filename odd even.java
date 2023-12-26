/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int a[]={1,2,3,4,5};
	    int b[]=new int[5];
	    int c[]=new int[5];
	    for(int i=0;i<a.length;i++){
	        if(a[i]%2==0)
	           b[i]=a[i];
	        else 
	           c[i]=a[i];
	    }
	    for(int i=0;i<b.length;i++){
	        if(b[i]!=0)
	          System.out.print(b[i]+" ");
	    }
	    System.out.println();
	    for(int i=0;i<c.length;i++){
	        if(c[i]!=0)
	          System.out.print(c[i]+" ");
	    }
		
	}
}
