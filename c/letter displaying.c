/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>
int main()
{
    char str[10],i=0,let,s2[30];
    int n,num=0;
    printf("enter string:");
    scanf("%s",str);
    while(str[i]!='\0'){
        if(islower(str[i]))
          let=str[i];
        if(isdigit(str[i])){
            num=0;
            while(isdigit(str[i])){
               num=num*10+str[i]-'0';
               i++;
            }
           for(int j=0;j<num;j++){
                printf("%c",let);
           }
           
        }
        else{
            i++;
        }
    }

    return 0;
}
