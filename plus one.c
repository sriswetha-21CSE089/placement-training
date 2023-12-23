/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{
    int num=0,rem,n;
    printf("size");
    scanf("%d",&n);
    printf("digit");
    int a[n];
    int b[n+1],j=n+1;
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
        num=num*10+a[i];
        
    }
    num=num+1;
    while(num>0){
        rem=num%10;
        b[j]=rem;
        //printf("%d=%d",j,b[j]);
        num/=10;
        j--;
    }
    for(int i=1;i<=n+1;i++){
        
       if(b[1]!=0)
           printf("%d,",b[i]);
    }
    
    
    

    return 0;
}
