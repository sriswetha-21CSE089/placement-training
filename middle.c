/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{   
    int a,b,c;
    printf("enter numbers:");
    scanf("%d%d%d",&a,&b,&c);
    if(a>b&&a<c||a>c&&a<b){
        printf("1");
    }
    else if(b>a&&b<c||b>c&&b<a){
        printf("2");
    }
    else{
        printf("3");
    }
    return 0;
}
