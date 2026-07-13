import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = a < b ? a : b;
        int i = n;

        while (true) {
            if (a%n==0 && b%n==0) 
                break; 
            n-=n/2;
        }
        System.out.println(n);
    }
}
