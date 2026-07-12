import java.util.Scanner;
public class sumofnaturals {
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        sum = num * (num  + 1)/2;
        System.out.println(sum);
    }
}
