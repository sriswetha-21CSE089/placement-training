/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>
#include <string.h>
int main()
{
    FILE* f1;
    FILE* f2;
   char ch;
   int temp=1,line=0;
   int f=0;
   char s[]="\nsri";
   int len=sizeof(s)/sizeof(s[0]);
   f1=fopen("abc.txt","r+");
   while(!feof(f1)){
       ch=getc(f1);
       printf("%c",ch);
   }
    rewind(f1);
    printf("\nenter line to replace:");
    scanf("%d",&line);
    f2=fopen("replace.txt","w");
   while(!feof(f1)){
       ch=getc(f1);
       if(ch=='\n')
         temp++;
       if(temp!=line)
         putc(ch,f2);
       else if(f==0&&temp==line){
           fwrite(s,1,strlen(s),f2);
           f=1;
       }
   }
     fclose(f1);
     fclose(f2);
     f1=fopen("replace.txt","r+");
   while(!feof(f1)){
       ch=getc(f1);
       printf("%c",ch);
   }
    fclose(f1);
    return 0;
}
