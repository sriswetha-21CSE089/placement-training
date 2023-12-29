/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
	     a o1=new a();
	     b o2=new b();
	     c o3=new c("parameterized constructor");
	     d o4=new d(3,4);
	}
}
class a{
    a(){
        
    }
}
class b{
    b(){
        System.out.println("no argument constructor");
    }
}
class c{
    c(String m){
        System.out.println(m);
    }
}
class d{
    d(int a,int b){
        System.out.println(a+b);
    }
}