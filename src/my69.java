import java.util.Scanner;

public class my69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        System.out.print(s.charAt(k - 1));
    }
}