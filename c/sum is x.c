/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>
void sum(int [],int,int);
int main()
{
    int n,x;
    printf("n=");
    scanf("%d",&n);
    int a[n];
    printf("A=");
    for(int i=0;i<n;i++){
       scanf("%d",&a[i]); 
    }
    printf("x=");
    scanf("%d",&x);
    sum(a,n,x);
    return 0;
}
void sum(int a[],int n,int x){
    int flag=0;
    for(int i=0;i<n;i++){
        for(int j=1;j<n;j++){
          if((a[i]+a[j])==x){
              //printf("%d",a[i]+a[j]);
              printf("yes");
              flag=1;
              break;
          }
      }
      if(flag==1){
          break;
      }
    }
}