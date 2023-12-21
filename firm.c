/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{
    int hr,day,workers,rem=0,totalhr=0;
    printf("no of hours");
    scanf("%d",&hr);
    printf("no of days");
    scanf("%d",&day);
    printf("no of workers");
    scanf("%d",&workers);
    rem=day-((10/100)*day);
    totalhr=(int)(rem*10*workers);
   
    return 0;
}
