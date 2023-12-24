/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>
int max(int [],int n);
int main()
{   
    int n,index;
    printf("n=");
    scanf("%d",&n);
    int a[n];
    printf("A=");
    for(int i=0;i<n;i++){
       scanf("%d",&a[i]); 
    }
    index=max(a,n);
    for(int i=0;i<n;i++){
       if(a[i]==index)
         a[i]=0;
    }
    
    printf("%d",max(a,n));
   

    return 0;
}
int max(int a[],int n){
    int max,index;
    max=a[0];
     for(int i=0;i<n;i++){
       if(max<a[i])
       {
            max=a[i];
           index=i;
       }
        
    }
    //printf("%d",max);
    return max;
}
