import java.util.*;

 public class javaCode3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Two Numbers :");

        int n1 = sc.nextInt(); // take a input form console and store it in n1 variable
        int n2 = sc.nextInt();

        int sum = n1 + n2;  

        System.out.print(n1 + " + " + n2 + " = " + sum); // 3 + 7 = 10
    }
}