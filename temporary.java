import java.util.Scanner;
public class temporary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number to be swapped :");
        int a = sc.nextInt();
        System.out.println("Enter the second number to be swapped :");
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping, the first number is : " + a);
        System.out.println("After swapping, the second number is : " + b);
        sc.close();
    }
}