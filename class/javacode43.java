import java.io.*;


public class javacode43{
    public static void main(String args[])
    {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
            
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close(); 
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}