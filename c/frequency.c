/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{
    int n,count=1,j=0;
    printf("N:");
    scanf("%d",&n);
    int a[n];
    int b[n];
    printf("Array:");
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    while(j<n-1){
        while(a[j]==a[j+1]){
            count++;
            j++;
            
        }
        if(count>1){
            printf("%d->%d,",a[j],count);
        }
        
        count=1;
        j++;
    }
    if(j==n-1){
        if(count>1){
            printf("%d->%d,",a[j],count);
        }
    }
   
    return 0;
}

