import java.util.Scanner;

public class my48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 1 ;
        for ( int i = 1 ; n >= i ; i ++){
            answer  *= i ;
        }
        System.out.print(answer);

    }}