/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.io.*;
public class Main
{
    
     
	public static void main(String[] args) {
	    permutation o =new permutation();
		int a[]={1,4,3};
		o.per(a,a.length,a.length);
	}
}
class permutation{
      void printarr(int a[],int n){
        for(int i=0;i<n;i++){
             System.out.print(a[i]+" ");
        }
         System.out.println();
       }
     void per(int a[],int size,int n){
        
        if(size==1)
          printarr(a,n);
          
        for(int i=0;i<size;i++){
             per(a,size-1,n);
             
             if(size%2==0){
                int temp=a[i];
                 a[i]=a[size-1];
                 a[size-1]=temp;
             }
             else{
                int temp=a[0];
                 a[0]=a[size-1];
                 a[size-1]=temp;
             }
         }
    }
    
}
