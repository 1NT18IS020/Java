import java.util.*;
class Swaping {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number");
        int b = sc.nextInt();
        
        //using 3rd variable
        int c;
        System.out.println("Before swapping 1st value is "+a+" 2nd value is "+b);
        c = a;
        a = b;
        b = c;
        System.out.println();
        System.out.println("Afert swapping 1st value is "+a+" 2nd value is "+b); 

    }
}
