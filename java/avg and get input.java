/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner o=new Scanner(System.in);
	    System.out.println("enter no:");
		int num=o.nextInt();
		System.out.println(num);
		System.out.println("enter f1:");
		float f1=o.nextFloat();
		System.out.println("enter f2:");
		float f2=o.nextFloat();
	    System.out.println("Average"+String.format("%.2f",((f1+f2)/2)));
	}
}
