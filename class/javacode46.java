import java.util.*;

public class javacode46{
    public static void main(String args[]){
        try{
        int a=10/0;
    }catch(ArithmeticException e){
        System.out.println("Cannot divide by zero.");
    }finally{
        System.out.println("This block always executes.");
    }
    }
}