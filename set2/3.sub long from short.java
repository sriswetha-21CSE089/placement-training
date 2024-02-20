/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    static String num(int a[]){
        String d="";
        for(int i:a)
          d+=i;
        return d;
    }
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int a[]={1,2,1,5,3},b[]={5,8,7,9};
		String s1=num(a);
		String s2=num(b);
		
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		if(n2>n1){
		    System.out.println(n2-n1);
		}
		else{
		    int max=a.length<=b.length?b.length:a.length;
		    int c=(int)Math.pow(10,max);
		    c=(((c-1)-n2)+n1);
		   // System.out.println(c+" "+n1+" "+n2);
		    String res=String.valueOf(c);
		    
		    
		}
		
	}
}
