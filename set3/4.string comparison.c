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
    int i=0;
    if(l1!=l2){
        printf("not equal");
    }
    else{
        for(i=0;i<l1;i++){
            if(s1[i]!=s2[i]){
                printf("not equal");
                break;
            }
        }
    }
   // printf("%d",i);
    if(i==l1){
        printf("equal");
    }
    return 0;
}

