import java.util.Scanner;

public class Task_P {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int a1 = in.nextInt();
        int b1 = in.nextInt();
        int c1 = in.nextInt();

        int n = (a*3600)+(b*60)+(c*1);
        int n1 = (a1*3600)+(b1*60)+(c1*1);

        System.out.println(n1-n);
    }
}