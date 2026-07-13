import java.util.Scanner;

class basic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Enter The Operator");
        String operator = sc.next();

            switch (operator) {
                case "+": 
                int sum = a+b;
                System.out.println("Addition of a and b = "+ sum);
                break;
                case "-": 
                sum = a-b;
                System.out.println("Subtraction of a and b = "+ sum);
                break;
                case "*": 
                sum = a*b;
                System.out.println("Multiple of a and b = "+ sum);
                break;
                case "/": 
                sum = a/b;
                System.out.println("Division of a and b = "+ sum);
                break;
            
                default:System.out.println("Invalid Input");
                    break;
            }
    }
}