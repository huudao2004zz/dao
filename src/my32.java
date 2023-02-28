import java.util.Scanner;
public class my32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("n là số chẵn");
        }
        else {
            System.out.println("n là số lẻ");
        }
}}
