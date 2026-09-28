import java.util.Scanner;

public class Task_M {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int n = (a*c);
        int n2 = (b*c);


        System.out.println(n+" "+n2);
    }
}