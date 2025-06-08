import java.util.*;

class car{
    int speed;
    String brand;
    String color;

    void output(){
        System.out.println("Speed : " + speed + " Brand : " + brand + " Color : "+ color );
    }

}

public class javacode34{
    public static void main(String[] args){

        // Scanner sc = new Scanner(System.in);

        car c1 = new car();

        c1.speed = 45;
        c1.brand ="BMW";
        c1.color ="red";

        c1.output();

    }
}