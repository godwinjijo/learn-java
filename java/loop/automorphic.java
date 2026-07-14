import java.util.Scanner;

public class automorphic {
    public static void main(String[] args) {
        System.out.println("Enter The Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = n;
        int sqr = n * n;
        boolean flag = true;

        while (n > 0) {
            int a = n % 10;
            int b = sqr % 10;

            if (a != b) {
                flag = false;
                break;
            }
            n = n / 10;
            sqr = sqr / 10;
        }
        if (flag) {
            System.out.println("Automorphic "+ i);
        }else{
            System.out.println("Not Automorphic");
        }

    }
}
