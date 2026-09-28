import java.util.Scanner;

public class Task_L {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int h = n/3600%24;
        int mm = n/60%60;
        int ss = n%60;

        System.out.println(h+":"+mm+":"+ss);
    }
}