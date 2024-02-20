/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include<stdio.h>

int main()
{
    char s1[]="baty",s2[]="tree";
    int n1=0,n2=0,i=0,j=0,k=0;
    while(s1[i]!='\0'){
        n1++;
        i++;
    }
    while(s2[j]!='\0'){
        n2++;
        j++;
    }
    char s3[n1+n2];
    while(s1[k]!='\0'){
        s3[k]=s1[k];
        k++;
    }
    j=0;
    if(s3[k-1]==s2[j]){
        while(s2[j]!='\0'){
             j++;
            s3[k]=s2[j];
            k++;
        }
    }
    else{
        while(s2[j]!='\0'){
             
            s3[k]=s2[j];
            j++;
            k++;
        }
    }
    printf("%s",s3);
    return 0;
}

