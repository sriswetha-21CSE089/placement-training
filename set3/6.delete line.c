/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{
    FILE* f1;
    FILE* f2;
    char ch;
    int line=0,temp=1;
    f1=fopen("file.txt","r+");
   
    while(!feof(f1)){
        ch=getc(f1);
        printf("%c",ch);
    }
    rewind(f1);
    printf("enter line no:");
    scanf("%d",&line);
    f2=fopen("newfile.txt","w");
    while(!feof(f1)){
        ch=getc(f1);
        if(ch=='\n')
          temp++;
        if(temp!=line){
            putc(ch,f2);
        }
    }
    fclose(f1);
    fclose(f2);
     f1=fopen("newfile.txt","r+");
   
    while(!feof(f1)){
        ch=getc(f1);
        printf("%c",ch);
    }
    fclose(f1);
    return 0;
}
