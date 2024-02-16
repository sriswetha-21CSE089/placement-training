/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    car c=new car(5);
	    motorcycle m=new motorcycle(4);
		System.out.println(c.calculateSpeed());
		System.out.println(m.calculateSpeed());
	}
}
class vehicle{
    double calculateSpeed(){
        return 0.0;
    }
}
class car extends vehicle{
    int pass;
    car(int p){
        pass=p;
    }
    double calculateSpeed(){
        return pass*110;
    }
}
class motorcycle extends vehicle{
    int wheel;
    motorcycle(int w){
        wheel=w;
    }
     double calculateSpeed(){
        return wheel*40;
    }
}