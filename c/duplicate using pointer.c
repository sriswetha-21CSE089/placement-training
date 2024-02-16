/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{
    int n=5;
   int a[]={1,2,4,3,8};
   int *p=a,flag=0;
  
   for(int i=0;i<n-1;i++){
       for(int j=i+1;j<n;j++){
           if(*(p+i)==*(p+j)){
                printf("%d ",*(p+j));
                flag=1;
           }
       }
       
   }
   if(flag==0)
      printf("-1");
  

    return 0;
}

