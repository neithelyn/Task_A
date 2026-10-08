import java.util.Scanner;

public class Task_o {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int t = (a *100 +b)*c;


        System.out.println(t/100+" "+ t%100);
    }
}