import java.io.*;

public class javacode44{
    public static void main(String args[]){

        try{
        FileOutputStream fos = new FileOutputStream("binary.dat");

        fos.write(65);
        fos.close();

        FileInputStream fis = new FileInputStream("binary.dat");
        int b = fis.read();

        System.out.println((char) b);
        fis.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}