/******************************************************************************
Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{
   int a[]={4,6,8,1,3,7,9};
   int i=0,diff=2,count=0,j;
   int len=sizeof(a)/sizeof(a[0]);
   //printf("%d",len);
   while(i<len){
       j=0;
       while(j<len){
           if(a[i]>a[j] && a[i]-a[j]==diff){
               count++;
               //printf("%d %d\n",a[i],a[j]);
               j++;
           }
           else{
               j++;
           }
       }
       i++;
   }
    printf("%d",count);
    return 0;
}


