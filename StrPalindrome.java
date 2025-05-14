package String;
import java.util.*;
class StrPalindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = sc.nextLine();
        char arr[] = s1.toCharArray();
        char newarr[] = new char[arr.length];

        int j = newarr.length-1;
        for(int i=0; i<=arr.length-1; i++){
            newarr[j] = arr[i];
            j--;
        }
        String revstr = new String(newarr);
        System.out.println("Oringnal string "+s1);
        System.out.println("Reverse String "+revstr);
        
        if(s1.equals(revstr))
            System.out.println("Entered string is palindrome");
        else
            System.out.println("Enrered string os not a palindrome");
    }
}