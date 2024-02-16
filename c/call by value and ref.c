/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>
void swap(int,int);
void swapref(int *,int *);
int main()
{
    int a=10,b=20;
    
   
   
    swap(a,b);
     printf("\nin the caller");
     printf("\nthe value of a is %d and b is %d",a,b);
     swapref(&a,&b);
     printf("\nin the caller of ref");
     printf("\nthe value of a is %d and b is %d",a,b);
}
void swap(int a,int b){
    int t;
    t=a;
    a=b;
    b=t;
    printf("\ninside the function");
    printf("\nthe value of a is %d and b is %d",a,b);
}
void swapref(int *x,int *y){
    int t;
    t=*x;
    *x=*y;
    *y=t;
    printf("\ninside the function");
    printf("\nthe value of a is %d and b is %d",*x,*y);
}