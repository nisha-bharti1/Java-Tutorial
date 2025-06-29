import java.io.*;

public class javacode45{
    public static void main(String args[]){
        File f=new File("data.txt");

        if(f.exists()){
            System.out.println("File Name : " + f.getName());

            System.out.println("Absolute Path : "+ f.getAbsolutePath());

            System.out.println("Writable : "+ f.canWrite());

            System.out.println("Readable : "+ f.canRead());

            System.out.println("File size in bytes : " + f.length());
        }
    }
}