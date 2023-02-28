import java.util.Scanner;
public class my33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0 ){
            System.out.println("n là số nguyên âm ");
        }
        if (n > 0 ){
            System.out.println("n là số nguyên dương ");
        }
        if (n == 0 ){
            System.out.println("n bằng 0 ");
        }
        }
}
