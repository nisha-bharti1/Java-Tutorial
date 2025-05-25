import java.util.*;

public class javacode30{
    public static void update(float marks[],int a){
        a=10;
        for(int i=0; i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }

    public static void main(String args[]){
        float marks[]=new float[5];
        int a = 5;

        Scanner sc= new Scanner(System.in);

        for(int i=0; i<marks.length; i++){
            marks[i]=sc.nextFloat();
        }

        update(marks,a);
        System.out.println(a);

         for(int i=0; i<marks.length; i++){
           System.out.println("Marks of student " + (i+1) + " = "+ marks[i]);
        }
    }
}