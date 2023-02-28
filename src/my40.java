import java.util.Scanner;

public class my40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if ( a <= b && b <= c ){
            System.out.println("increasing");
        }
        else if (a >= b && b >= c)
    {
        System.out.println("decreasing");
    }
        else  {
                System.out.println("neither increasing nor decreasing order");
        }
        }
}

