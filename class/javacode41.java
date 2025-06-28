import java.util.*;

interface Vehicle{
    void start();
    void stop();
}

class Car implements Vehicle{
    public void start(){
        System.out.println("Car is starting");
    }

    public void stop(){
        System.out.println("Car is stopping");
    }
}

public class javacode41{
    public static void main(String args[]){
        Car c =new Car();
        c.start();
        c.stop();
    }
}