import java.util.Scanner;

class lcm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc .nextInt();
        int b = sc.nextInt();
        int n = a > b ? a : b;
        int i = n;

        while (true) {
            if (n%a==0 && n%b==0) {
                n = n + i;
            }
            System.out.println(n);
        }
    }
} 