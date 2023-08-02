import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Addition");
        System.out.println("Substraction");
        System.out.println("Multiplication");
        System.out.println("Division");
        System.out.println("Enter the choice");
        int choice =sc.nextInt();
        System.out.println("Enter First Number:");
        a= sc.nextInt();
        System.out.println("Enter Second Number:");
        b= sc.nextInt();
        int c=0;
        switch(choice){
            case 1: 
            c=a+b;
            break;
            case 2:
            c=a-b;
            break;
            case 3:
            c=a*b;
            break;
            case 4:
            c=a/b;
            break;
            default:System.out.println("Entered choice is invalid");
        }
        System.out.println("Result = "+c);
    }
}