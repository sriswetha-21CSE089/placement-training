/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{
     char s1[]="hello1",s2[]="hello";
    int l1=sizeof(s1)/sizeof(s1[0]);
    int l2=sizeof(s2)/sizeof(s2[0]);
    char s3[l1+l2];
    int i=0,k=0;
    while(s1[i]!='\0'){
        s3[i]=s1[i];
        i++;
    }
    while(s2[i]!='\0'){
        s3[i]=s2[k];
        i++;
        k++;
    }
    printf("%s",s3);
    
    return 0;
}

