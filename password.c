/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>
#include <ctype.h>
#include <string.h>
int main()
{
    char str[15];
    int c1=0,c2=0,c3=0,c4=0;
    printf("enter password:");
    scanf("%s",str);
    for(int i=0;i<str[i]!='\0';i++){
        if(isupper(str[i]))
            ++c1;
        if(islower(str[i]))
            ++c2;
        if(str[i]=='!'||str[i]=='@'||str[i]=='#'||str[i]=='$'||str[i]=='%'||str[i]=='^'||str[i]=='&'||str[i]=='*'||str[i]=='('||str[i]==')'||str[i]=='-'||str[i]=='+')
            ++c3;
        if(isdigit(str[i]))
            ++c4;
            
    }
    if(c1>=1 && c2>=1 && c3>=1 && c4>=1 &&(strlen(str)>=8))
    {
        printf("strong");
    }
    else if((c1>=1||c2>=1||c4>=1)&&(strlen(str)>5))
    {
        printf("moderate");
    }
    else{
        printf("weak");
    }

    return 0;
}
