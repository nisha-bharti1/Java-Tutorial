import java.util.*;

class car{
    int Speed;
    String brand;
    String color;

    car(int speed,String brand,String color){

        this.Speed = speed;
        this.brand = brand;
        this.color = color;

        
    }

    void display(){
        System.out.println("Speed : " + Speed + " Brand : " + brand + " Color : "+ color );
    }

}

public class javacode35{
    public static void main(String[] args){

        // Scanner sc = new Scanner(System.in);

        car c1 = new car(45,"BMW","red");

        c1.display();

    }
}