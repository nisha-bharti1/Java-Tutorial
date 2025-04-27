//  Wap to create a calculator
import java.util.*;

public class javacode12{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Two Number ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.print("Enter the Operator(+,-,*,/,%) to perform calculation ");
        char op = sc.next().charAt(0);

        switch(op){
            case '+': 
                System.out.print(n1+n2);
                break;
            case '-':
                System.out.print(n1-n2);
                break;
            case '*':
                System.out.print(n1*n2);
                break;
            case '/':
                System.out.print(n1/n2);
                break;
            case '%':
                System.out.print(n1%n2);
                break;
            default:
                System.out.print("Wrong operator");

        }


    }
}