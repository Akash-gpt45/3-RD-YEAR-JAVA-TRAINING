import java.util.Scanner;
public class rectanglecalc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rectangle in cm");
        double length = sc.nextDouble();
        System.out.println("Enter width of rectangle in cm");
        double width = sc.nextDouble();
        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.println("Area: " + area + " cm²");
        System.out.println("Perimeter: " + perimeter + " cm");
        sc.close();
    }
}