import java.util.*;

class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        super.sound();
        System.out.println("Dog bark");
    }
}

public class javacode40{
    public static void main(String[] args){
        Dog d1=new Dog();
        d1.sound();
    }
}