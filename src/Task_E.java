import java.util.Scanner;

public class Task_E {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int c = (a*b);
        int d = (c%109);
        if (d <0) {
            d +=109;
        }
        System.out.print(d);

    }
}
