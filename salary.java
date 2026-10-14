import java.util.Scanner;
public class salary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee name");
        String name = sc.nextLine();
        System.out.println("Enter basic salary");
        double basicSalary = sc.nextDouble();
        System.out.print("Enter bonus\n");
        double bonus = sc.nextDouble();
        double totalSalary = basicSalary + bonus;
        System.out.printf("Employee Name: %s\n", name);
        System.out.printf("Total Salary: %.2f\n", totalSalary);
        sc.close();
    }
}