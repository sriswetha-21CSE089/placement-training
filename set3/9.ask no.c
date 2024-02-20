/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{
    
    int n;
    while(1){
        printf("enter no between 1 and 9:");
        scanf("%d",&n);
        printf("\n");
        if(n>=1 && n<=9){
            printf("you entered:%d",n);
            break;
        }
    }

    return 0;
}

