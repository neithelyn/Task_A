import java.util.Scanner;

public class Task_K {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        int b = a/60%24;
        int c = a%60;

        System.out.println(b + " "+ c);
        }



    }

