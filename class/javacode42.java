import java.io.*;


public class javacode42{
    public static void main(String args[])
    {
        try{
            FileWriter writer = new FileWriter("data.txt");
            writer.write("Hello, I am teaching Java");
            writer.close();

            FileReader reader = new FileReader("data.txt");
            int data;

            while((data = reader.read()) != -1){
                System.out.print((char) data);
            }
             reader.close();


        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
}