// Wap a program to find even or odd through ternary operator

import java.util.*;

public class javacode11{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number ");
        int number = sc.nextInt();

        String type =(number%2==0)?"even":"odd";

        System.out.print(type);



    }
}