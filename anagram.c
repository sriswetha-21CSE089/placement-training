/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>
#include <string.h>
#include <stdbool.h>
void sort(char []);
int main()
{
    int len1,len2;
    char str1[10],str2[10];
    bool flag=true;
    printf("string1:");
    scanf("%s",str1);
    printf("string2:");
    scanf("%s",str2);
    len1=strlen(str1);
    len2=strlen(str2);
    if(len1!=len2){
         printf("false");
    }
     
    else{
          sort(str1);sort(str2);
          for(int i=0;i<len1;i++){
              if(str1[i]!=str2[i]){
                   printf("false");
                   return 0;
              }
          }
          
            printf("true");
        }
    
    return 0;
}
void sort(char s[]){
    int len1=strlen(s);
    char temp;
    for(int i=0;i<len1-1;i++){
            for(int j=i+1;j<len1;j++){
                if(s[i]>s[j]){
                    temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                }
                
            }
     }
    
}
