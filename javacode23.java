import java.util.*;

public class javacode23{
    public static void calculate_sum(){
        System.out.println("Enter the 2 number");
        Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum =a+b;

    System.out.println("Sum : "+ sum);
    }

    public static void main(String args[]){
        calculate_sum();
    }
}