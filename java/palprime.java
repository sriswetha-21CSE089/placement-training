/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static boolean palindrome(int a){
        //boolean flag1=false;
        int temp=a,rem,sum=0;
        while(a>0){
		        rem=a%10;
		        sum=sum*10+rem;
		        a/=10;
		    }
		    if(temp==sum){
		        return true;
		    }
		    else{
		        return false;
		    }
    }
    public static boolean prime(int a){
            if(a==1){
		         return true;
		    }
		    for(int j=2;j<a/2;j++){
		        if(a%j==0){
		             return false;
		        }
		    }
		    return true;
    }
	public static void main(String[] args) {
	    Scanner o=new Scanner(System.in);
	    int temp,rem,sum;
	    boolean f1,f2;
		System.out.println("enter array size");
		int n=o.nextInt();
		int a[]=new int[n];
		palprime p[]=new palprime[n];
		System.out.println("enter elements");
		for(int i=0;i<a.length;i++){
		    a[i]=o.nextInt();
		    f1=palindrome(a[i]);
		    f2=prime(a[i]);
		    if(f1==true && f2==true){
		         p[i]=new palprime(a[i],"palprime");
		    }
		    else if(f1==true && f2==false){
		        p[i]=new palprime(a[i],"palindrome");
		    }
		    else if(f1==false && f2==true){
		        p[i]=new palprime(a[i],"prime");
		    }
		    else{
		        p[i]=new palprime(a[i],"none");
		    }
		    
		}
		
		
	}
}
class palprime{
    
    palprime(int n,String m){
        System.out.println("Number "+n+" is "+m);
        
    }
}