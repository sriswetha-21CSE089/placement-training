/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{
    
    int n;
    scanf("%d",&n);
    int a=0,b=1,c=0;
    printf("%d %d",a,b);
    for(int i=n;i>0;i--){
        c=a+b;
        printf(" %d",c);
        a=b;
        b=c;
    }

    return 0;
}

