import java.util.Scanner;

public class my41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();
        if ( x == 0 || y == 0  ) {
            System.out.println("errol");}
        if ( x >= 1 && y >=1 ) {
            System.out.println("This point lies in the First quadrant");
        } else if ( x <= 1 && y >=1 ) {
            System.out.println("This point lies in the Second quadrant");
        }else if ( x <= 1 && y <=1 ) {
            System.out.println("This point lies in the Third quadrant");
        }else if ( x >= 1 && y <=1 ) {
            System.out.println("This point lies in the Fourth quadrant");
        }

    }
}
