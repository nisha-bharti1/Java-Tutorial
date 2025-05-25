import java.util.*;

public class javacode29{
    public static void main(String args[]){
        float marks[]=new float[5];

        Scanner sc= new Scanner(System.in);

        // marks[0]=sc.nextFloat();
        // marks[1]=sc.nextFloat();
        // marks[2]=sc.nextFloat();
        // marks[3]=sc.nextFloat();
        // marks[4]=sc.nextFloat();

        // System.out.println("Marks of student 1 = "+ marks[0]);
        // System.out.println("Marks of student 2 = "+ marks[1]);
        // System.out.println("Marks of student 3 = "+ marks[2]);
        // System.out.println("Marks of student 4 = "+ marks[3]);
        // System.out.println("Marks of student 5 = "+ marks[4]);

        // System.out.println("length of array = " + marks.length);

        for(int i=0; i<marks.length; i++){
            marks[i]=sc.nextFloat();
        }

         for(int i=0; i<marks.length; i++){
           System.out.println("Marks of student " + (i+1) + " = "+ marks[i]);
        }
    }
}