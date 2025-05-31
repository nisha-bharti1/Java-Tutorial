import java.util.*;

public class javacode31{

    public static int getlargest(int number[]){
        int largest= Integer.MIN_VALUE;

        for(int i=0;i<number.length; i++){

            if(largest<number[i]){
                largest=number[i];
            }
        }

        return largest;
    }

    public static void main(String args[]){
        int number[]=new int[10];

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number : ");
        for(int i=0; i<number.length; i++){
            number[i]=sc.nextInt();
        }

        int largest =getlargest(number);

        // System.out.println("Elements are : ");
        // for(int i=0; i<number.length; i++){
        //     System.out.println((i+1)+ " " + number[i]);
        // }

        System.out.print("largest value: " + largest);
    }
}