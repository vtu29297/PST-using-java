import java.util.*;
public class Palindrome {
    public static boolean palindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        boolean res=palindrome(str);
        if(res==false){
            System.out.println("it is not palindrome");
        }else{
            System.out.println("it is a palindrome");
        }
        sc.close();
    }
}
