import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add");
        System.out.println("2. Substract");
        System.out.println("3. multiply");
        System.out.println("4. Divide");

        System.out.println("Enter a choice !");
        int choice = sc.nextInt();
        System.out.println("Enter first number :  ");
        double a = sc.nextInt();
        System.out.println("Enter second number :  ");
        double b = sc.nextInt();

        switch(choice){
            case 1: System.out.println((a+b));
            break;

            case 2: System.out.println((a-b));
            break;

            case 3: System.out.println(a*b);
            break;

            case 4: System.out.println((a/b));
            break;
            default : System.out.println("enter Valid choice");
            break;
        }
        
    }
}