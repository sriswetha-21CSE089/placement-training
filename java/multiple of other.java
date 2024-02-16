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
		int a[]={1,2,3,4};
		int len=a.length;
		int b[]=new int[len];
		int mul=1;
		for(int i=0;i<a.length;i++){
		    mul=1;
		    for(int j=0;j<a.length;j++){
		        if(i!=j){
		            mul*=a[j];
		            b[i]=mul;
		        }
		    }
		}
		for(int i=0;i<b.length;i++){
		    System.out.print(b[i]+" ");
		}
	}
}
