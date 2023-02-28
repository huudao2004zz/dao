import java.util.Scanner;

public class my46{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int  answer = 0;
        for (int i = 0 ; i <= a ; i++){
            if( i % 2 !=0){
                answer += i;
            }
        }
        System.out.print(answer);
    }}