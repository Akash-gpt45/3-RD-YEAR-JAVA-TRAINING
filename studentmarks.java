import java.util.Scanner;
public class studentmarks{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name");
        String name = sc.nextLine();
        System.out.println("Enter the marks of 5 subjects");
        int[] marks = new int[5];
        for(int i = 0; i < 5; i++){
            System.out.println("Enter marks for subject " + (i + 1));
            marks[i] = sc.nextInt();
        }
        int total = 0;
        for(int i = 0; i < 5; i++){
            total += marks[i];
        }
        double average = total / 5.0;
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        sc.close();
    }
}