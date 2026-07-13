import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the NUmber");
         int n = sc.nextInt();
         boolean flag = true;

         for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                flag = false;
                break;
            }
         }
         if (n > 2 && flag) {
            System.out.println("The Number is Prime");
         }else{
            System.out.println("The Number is Not Prime");
         }
    }
}
