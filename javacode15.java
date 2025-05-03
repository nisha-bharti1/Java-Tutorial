import java.util.*;

public class javacode15{
    public static void main(String args[]){
       Scanner sc= new Scanner(System.in);

       System.out.println("Enter The any number");
        int n = sc.nextInt();

       while (n!=5){
        System.out.println("Enter The any number");
        n = sc.nextInt();
        if (n==5)
            break;
        System.out.println("go");
       }
       
    }
}