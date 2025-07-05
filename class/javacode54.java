import java.util.*;


 abstract class Animal{
    abstract void makesound();

}

public class javacode54{
    public static void main(String args[])
    {
        Animal dog = new Animal(){
            void makesound(){
                System.out.println("Woof ");
            }
        };

        dog.makesound();

    }
}