import java.util.*;

public class javacode9{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int age;

        System.out.println("Enter Your age :");
        age = sc.nextInt();

        if( age >= 18){
            System.out.println(age + " Adult: Drive, Vote");
        }
        else{
            System.out.println("Not Adult");
        }

    }
}