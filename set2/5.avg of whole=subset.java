/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    static void dis(int b[],int k){
        for(int i=0;i<k;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
    }
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int a[]={10,20,30,40};
		int b[]=new int[a.length];
		int n=a.length,k=0,avg=0,sum;
		for(int i:a)
		  avg+=i;
		avg/=a.length;
		for(int i=0;i<(1<<n);i++){
		    k=0;
		    sum=0;
		    for(int j=0;j<n;j++){
		        if((i&(1<<j))>0){
		           b[k]=a[j];
		           k++;
		           sum+=a[j];
		        }
		    }
		    
		   // System.out.print(k+" "+sum+" ");
		    if(k!=0 && sum/k==avg && k!=n)
		        dis(b,k);
		    
		    
		    //System.out.println();
		}
	}
}
