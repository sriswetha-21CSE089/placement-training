/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{
   int n=8,max=0,cur=0,start,end,s=0;
   int a[]={-2,-3,4,-1,-2,1,5,-3};
   for(int i=0;i<n;i++){
       cur=cur+a[i];
       if (max<cur){
           max=cur;
           start=s;
           end=i;
       }
         
       if(cur<0){
            cur=0;
            s+=1;
       }
         
            
   }
   for(int i=start;i<=end;i++)
      printf("%d ",a[i]);
    return 0;
}
