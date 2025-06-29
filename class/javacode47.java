import java.util.*;

public class javacode47{
    public static void main(String args[]){
        try{
            int [] arr = new int[5];
            arr[10]=50;
    }catch(ArithmeticException e){
        System.out.println("Arithmetic Error.");
    
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Array index Error");
    }catch(Exception e){
        System.out.println("General Exception");
    }
    finally{
        System.out.println("This block always executes.");
    }
    }
}