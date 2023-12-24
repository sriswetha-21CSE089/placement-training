/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{
    int m=5,n=3;
   int a[]={1,2,3,4,5},b[]={1,2,3};
   int i=0,j=0,*p1=a,*p2=b;
   
   while(i<m && j<n){
       if(*(p1+i)<*(p2+j)){
           printf("%d",*(p1+i));
           i++;
       }
       else if(*(p2+j)<*(p1+i)){
            printf("%d",*(p1+j));
            j++;
       }
       else{
           printf("%d",*(p1+j));
           j++;i++;
       }
         
   }
   while(i<m)
    {
         printf("%d",*(p1+i));
         i++;
    }
    while(j<n)
    {
         printf("%d",*(p1+j));
         j++;
    }
    return 0;
}
