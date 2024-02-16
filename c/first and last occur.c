/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{
    int n,x,first=0,last=0,flag=0;
    printf("n=");
    scanf("%d",&n);
    int a[n];
    printf("A=");
    for(int i=0;i<n;i++){
       scanf("%d",&a[i]); 
    }
    printf("x=");
    scanf("%d",&x);
    for(int i=0;i<n;i++){
        flag=0;
        if(a[i]==x){
            first=i;
            while(a[i]==x){
                last=i;
                i++;
            }
        }
    }
   if(first==0 && last== 0)
   {
       printf("-1 -1");
   }
   else{
        printf("%d %d",first,last);
   }
      
   
    return 0;
}
