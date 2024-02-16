/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		employee e=new employee("xxx",23,123456783,"kamarajar salai",30000,"researcher","ux");
		manager m=new manager("yyy",25,1256325633,"porur",40000,"artist","architecture");
		e.display();
		m.display();
	}
}
class member{
    String name;
    int age;
    long phone;
    String address;
    int salary;
    member(String n,int a,long p,String add,int s){
        name=n;
        age=a;
        phone=p;
        address=add;
        salary=s;
    }
    void printsalary(){
        System.out.println(salary);
    }
    void display(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("phone:"+phone);
        System.out.println("address:"+address);
    }
}
class employee extends member{
    String specialization;
    String dept;
     employee(String n,int a,long p,String add,int s,String sp,String dept){
        super(n,a,p,add,s);
        this.specialization=sp;
        this.dept=dept;
    }
    void display(){
        super.display();
        super.printsalary();
        System.out.println("specialization:"+specialization);
        System.out.println("department:"+dept);
    }
}
class manager extends member{
    String specialization;
    String dept;
     manager(String n,int a,long p,String add,int s,String sp,String dept){
        super(n,a,p,add,s);
        this.specialization=sp;
        this.dept=dept;
    }
    void display(){
        super.display();
        super.printsalary();
        System.out.println("specialization:"+specialization);
        System.out.println("department:"+dept);
    }
}