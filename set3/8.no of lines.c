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
   char ch;
   int temp=1;
   f1=fopen("lines.txt","r+");
   while(!feof(f1)){
       ch=getc(f1);
       if(ch=='\n')
         temp++;
   }
   fclose(f1);
   printf("%d",temp);
    return 0;
}
