/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    public static boolean ch(char a){
        if(a>='a' && a<='z'||a>='A' && a<='Z'||a>='0' && a<='9'){
            return true;
        }
         return false; 
    }
	public static void main(String[] args) {
        String s="i*( list &9";
        String res="";
        int i=0,j=s.length()-1;
        while(i<s.length()-1){
            if(ch(s.charAt(i)) && ch(s.charAt(j))){
                res+=s.charAt(j);
                i++;
                j--;
            }
            else if (!ch(s.charAt(j))){
                j--;
            }
            else{
                res+=s.charAt(i);
                i++;
            }
        }
        if(ch(s.charAt(0)))
          res+=s.charAt(0);
        else
          res+=s.charAt(s.length()-1);
        System.out.println(s);
        System.out.println(res);
	}
}
