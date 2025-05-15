import java.util.*;
class Swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number");
        int b = sc.nextInt();
        System.out.println("Before swapping 1st value is "+a+" 2nd value is "+b);

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("after swapping 1st value is "+a+" 2nd value is "+b);
    }
}
