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
		calculator c=new calculator();
		System.out.println(c.multiply(2,3));
		System.out.println(c.multiply(2,15,2));
	}
}
class calculator{
    int multiply(int a,int b){
        return a*b;
    }
    double multiply(double a,double b,double c){
        return a*b*c;
    }
}