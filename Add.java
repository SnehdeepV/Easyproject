import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1 ");
        int num_1 = sc.nextInt();
        System.out.println("Enter the number2 ");
        int num_2 = sc.nextInt();
        int sum = num_1 + num_2;
        System.out.println("The sum is " + sum);
        sc.close();
    }
}