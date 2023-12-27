/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String words[]={"mat","mate","matbellmates","bell","bellmatesbell","butterribbon","butter","ribbon"};
		Arrays.sort(words,(a,b)->Integer.compare(b.length(),a.length()));
		for(String i:words){
		    	System.out.println(i);
		}
		ArrayList<String> arr=new ArrayList<>();
		arr.add(words[0]);
		int i=1,j=1,flag;
		while(i<words.length){
		    flag=1;
		    for(int k=0;k<j;k++){
		        if(arr.get(k).indexOf(words[i])!=-1){
		            flag=0;
		            break;
		        }
		    }
		    if(flag==1){
		        arr.add(words[i]);
		        j++;
		    }
		    i++;
		}
		System.out.println(arr);
	}
}
