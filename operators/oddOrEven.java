import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         
        if (n%2==0) {
            System.out.println("The Number is Even "+n);
        }else{
            System.out.println("The Number is Odd "+n);
        }

    }
}
