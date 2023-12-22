/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>
#include <math.h>
int main()
{
    char s;
    int size;
    printf("shape:");
    scanf("%c",&s);
    printf("size:");
    scanf("%d",&size);
    if(s=='S'){
        printf("Area of Square:%d",(int)pow(size,2));
    }
    else if(s=='C'){
        printf("Area of circle:%f",2*3.14*(size/2));
    }
    return 0;
}
