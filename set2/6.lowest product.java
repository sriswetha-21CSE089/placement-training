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
		int a[]={1,2,-4,-9,5};
		int len=a.length/2;
		int low=0,pro=0;
		for(int i=0;i<=len;i++){
		    for(int j=i+1;j<=len+1;j++){
		        for(int k=j+1;k<=a.length-1;k++){
		            pro=a[i]*a[j]*a[k];
		            if(pro<low)
		              low=pro;
		        }
		    }
		}
		System.out.print(low);
	}
}
