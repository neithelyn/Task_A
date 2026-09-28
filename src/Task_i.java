import java.util.Scanner;

public class Task_i {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int a = n / 100;
        int b = n / 10 % 10;
        int c = n % 10;

        System.out.println(a + b + c);
    }
}