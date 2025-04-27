// Wap to check given age is adult, teenager or child.

import java.util.*;

public class javacode10{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int age;

        System.out.println("Enter the Age: ");
        age=sc.nextInt();

        if(age >= 18){
            System.out.println("Adult");
        }
        else if(age>=13 && age<18){
            System.out.println("Teenager");
        }

        else{
            System.out.println("child");
        }

    }
}