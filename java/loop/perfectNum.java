import java.util.Scanner;

public class perfectNum {
    public static void main(String[] args) {
        System.out.println("Enter The Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n/2; i++){
            if (n % i == 0) {
                sum = sum + i; 
            }
        }
        if (n == sum && n!=0) {
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not Perfect Number");
        }
    }
}
