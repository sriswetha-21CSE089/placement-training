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
		manager m=new manager("xxx",101);
		System.out.println(m.name);
		System.out.println(m.id);
		m.calculatesalary(0.16);
		developer d=new developer("yyy",1001);
		System.out.println(d.name);
		System.out.println(d.id);
		d.calculatesalary(1600);
	}
}
class employee{
    String name;
    int id;
    float bs=50000;
    void calculatesalary(int amt){
        System.out.println(bs+amt);
    }
    void calculatesalary(double per){
        System.out.println((bs*per)+bs);
    }
}
class manager extends employee{
    float percentage;
    manager(String name,int id){
        super.name=name;
        super.id=id;
    }
}
class developer extends employee{
    int allowance;
    developer(String name,int id){
        super.name=name;
        super.id=id;
    }
}